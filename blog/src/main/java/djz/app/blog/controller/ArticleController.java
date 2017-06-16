package djz.app.blog.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import djz.app.blog.model.Article;
import djz.app.blog.service.ArticleService;
import djz.app.blog.util.ConstantSet;

@Controller
@RequestMapping("/article")
public class ArticleController {
	@Resource(name = "articleService")
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
		Collections.reverse(articles);
		mav.addObject("articles", articles);
		mav.setViewName("article_list");
		return mav;
	}

	/**
	 * 将文章保存到数据库
	 * 
	 * @param article
	 * @return
	 */
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public ModelAndView articleList(MultipartFile contentFile, HttpServletRequest request, Article article) {
		articleService.saveArticleContentFile(contentFile, request);
		articleService.setArticleValue(article);
		articleService.save(article);
		ModelAndView mav = new ModelAndView();
		mav.addObject(ConstantSet.RESULT_CODE, ConstantSet.SUCCESS_CODE);
		mav.setViewName(ConstantSet.ACTION_RESULT_VIEW);
		return mav;
	}
	//
	// @RequestMapping("/queryList")
	// public ModelAndView queryDB() {
	// ModelAndView mav = new ModelAndView();
	// ArrayList<Article> articles = (ArrayList<Article>)
	// articleService.findByHQL("from Article", null);
	// mav.addObject("articles", articles);
	// mav.setViewName("queryDB");
	// return mav;
	// }

	@RequestMapping("/savePage")
	public ModelAndView saveArticleView() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/article_save");
		return mav;
	}

	/**
	 * 取得内容文章内容
	 * @param articleId
	 * @return
	 */
	@RequestMapping("/articleContent")
	public ModelAndView articleContent(String articleId) {
		ModelAndView mav = new ModelAndView();
		Article article = articleService.findById(Long.parseLong(articleId));
		String content = articleService.getArticleContent(article);
		mav.addObject("article_content", content);
		mav.addObject(ConstantSet.RESULT_CODE, ConstantSet.SUCCESS_CODE);
		mav.addObject("article_title",article.getTitle());
		mav.setViewName("article");
		return mav;
	}
}
