package djz.app.blog.serviceimpl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import djz.app.blog.dao.ArticleDao;
import djz.app.blog.model.Article;
import djz.app.blog.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Resource
	ArticleDao articleDao;

	@Override
	public void saveArticle(Article article) {
		articleDao.saveArticle(article);

	}

	@Override
	public void deleteArticle(Long articleId) {
		articleDao.deleteArticle(articleId);

	}

	@Override
	public void updateArticle(Article article) {
		articleDao.updateArticle(article);

	}

	@Override
	public Article queryArticle(Long articleId) {		
		return articleDao.queryArticle(articleId);
	}

	@Override
	public ArrayList<Article> getAllArticles() {
		return articleDao.getAllArticles();
	}

}
