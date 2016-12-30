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

}
