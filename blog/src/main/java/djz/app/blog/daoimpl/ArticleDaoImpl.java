package djz.app.blog.daoimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import djz.app.blog.dao.ArticleDao;
import djz.app.blog.model.Article;
import djz.app.blog.util.HibernateDaoSupport;

@SuppressWarnings("all")
@Repository("articleDao")
public class ArticleDaoImpl extends HibernateDaoSupport implements ArticleDao {

	@Override
	public void saveArticle(Article article) {
		Session session = this.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.save(article);
		transaction.commit();		

	}

	@Override
	public void deleteArticle(Long articleId) {
		Session session = this.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Article article = new Article(articleId);
		session.delete(article);
		transaction.commit();		
	}

	@Override
	public void updateArticle(Article article) {
		
		Session session = this.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		session.update(article);
		transaction.commit();	
	}

	@Override
	public Article queryArticle(Long articleId) {
		  Session session = this.getCurrentSession();  
	        Transaction transaction = (Transaction) session.beginTransaction();  
	        Article article = (Article)session.get(Article.class, articleId);  
	       
	        	transaction.commit(); 	      	      
	        return article;  
	}

	
	@Override
	public ArrayList<Article> getAllArticles() {
		ArrayList<Article> articles = new ArrayList<>();
		Session session = this.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		List list= session.createQuery("from article").list();	
		  for (Iterator iterator = list.iterator(); iterator.hasNext();) {  
	            Article a = (Article) iterator.next();  
	            articles.add(a);  
	        } 
		transaction.commit();		
		return articles;
	}

}
