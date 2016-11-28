package djz.app.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.MvcNamespaceHandler;

import djz.app.blog.model.Article;
import djz.app.blog.service.ArticleService;

@Controller
public class MainController {
	@Autowired
	ArticleService articleService;

	@RequestMapping("/saveDB")
	public ModelAndView articleList(Article article) {
		System.out.println(article.getCategory());
		System.out.println(article.getIsOriginal());
		System.out.println(article.getTitle());
		ModelAndView mav = new ModelAndView();
		// 操作
		articleService.saveArticle(article);
		return mav;
	}

	@RequestMapping("/saveArticle")
	public ModelAndView saveArticleView() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/info");
		return mav;
	}
}
