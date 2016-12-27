package djz.app.blog.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.MvcNamespaceHandler;

import djz.app.blog.model.Article;
import djz.app.blog.service.ArticleService;

@Controller
public class ArticleController {
	@Autowired
	ArticleService articleService;

	/**
	 * 显示主界面文章列表
	 * 
	 * @return
	 */
	@RequestMapping("/main")
	public ModelAndView MainView() {
		ModelAndView mav = new ModelAndView();

		ArrayList<Article> articles = (ArrayList<Article>) articleService.findByHQL("from Article", null);
		mav.addObject("articles", articles);
		mav.setViewName("article");
		return mav;
	}

	@RequestMapping("/saveDB")
	public ModelAndView articleList(Article article) {
		System.out.println(article.getCategory());
		System.out.println(article.getIsOriginal());
		System.out.println(article.getTitle());
		ModelAndView mav = new ModelAndView();
		// 操作
		articleService.save(article);
		return mav;
	}

	@RequestMapping("/queryDB")
	public ModelAndView queryDB() {
		ModelAndView mav = new ModelAndView();
		ArrayList<Article> articles = (ArrayList<Article>) articleService.findByHQL("from Article", null);
		mav.addObject("articles", articles);
		mav.setViewName("queryDB");
		return mav;
	}

	@RequestMapping("/saveArticle")
	public ModelAndView saveArticleView() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/info");
		return mav;
	}
}
