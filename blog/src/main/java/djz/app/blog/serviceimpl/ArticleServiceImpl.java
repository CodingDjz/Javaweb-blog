package djz.app.blog.serviceimpl;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import djz.app.blog.model.Article;
import djz.app.blog.service.ArticleService;

@Service
public class ArticleServiceImpl extends BaseServiceImpl<Article> implements ArticleService {

	@Override
	public Serializable save(Article entity) {
		Date date = new Date();
		entity.setCreateTime(date);
		return super.save(entity);
	}

	public String saveArticleContentFile(MultipartFile contentFile) {
		return "";
	}

	// @Resource
	// ArticleDao articleDao;
	//
	// @Override
	// public void saveArticle(Article article) {
	// articleDao.saveArticle(article);
	//
	// }
	//
	// @Override
	// public void deleteArticle(Long articleId) {
	// articleDao.deleteArticle(articleId);
	//
	// }
	//
	// @Override
	// public void updateArticle(Article article) {
	// articleDao.updateArticle(article);
	//
	// }
	//
	// @Override
	// public Article queryArticle(Long articleId) {
	// return articleDao.queryArticle(articleId);
	// }
	//
	// @Override
	// public ArrayList<Article> getAllArticles() {
	// return articleDao.getAllArticles();
	// }

}
