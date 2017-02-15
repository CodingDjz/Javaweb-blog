package djz.app.blog.daoimpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import djz.app.blog.dao.ArticleDao;
import djz.app.blog.model.Article;

@SuppressWarnings("all")
@Repository("articleDao")
@Transactional
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {
	
}
