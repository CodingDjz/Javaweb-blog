package djz.app.blog.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import djz.app.blog.dao.ArticleDao;
import djz.app.blog.model.Article;
import djz.app.blog.util.HibernateDaoSupport;

@SuppressWarnings("all")
@Repository("articleDao")
@Transactional
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {

	// @Override
	// public Serializable save(Article article) {
	// Session session = this.getCurrentSession();
	// return session.save(article);
	//
	// }
	//
	// @Override
	// public void delete(Long articleId) {
	// Session session = this.getCurrentSession();
	// Article article = new Article(articleId);
	// session.delete(article);
	// }
	//
	// @Override
	// public void updateArticle(Article article) {
	//
	// Session session = this.getCurrentSession();
	// session.update(article);
	// }
	//
	// @Override
	// public Article queryArticle(Long articleId) {
	// Session session = this.getCurrentSession();
	// Article article = (Article) session.get(Article.class, articleId);
	//
	// return article;
	// }
	//
	// @Override
	// public ArrayList<Article> getAllArticles() {
	// ArrayList<Article> articles = new ArrayList<>();
	// Session session = this.getCurrentSession();
	// List list = session.createQuery("from Article").list();
	// for (Iterator iterator = list.iterator(); iterator.hasNext();) {
	// Article a = (Article) iterator.next();
	// articles.add(a);
	// }
	// return articles;
	// }

}
