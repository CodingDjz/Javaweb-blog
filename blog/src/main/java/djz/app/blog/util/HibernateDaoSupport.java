package djz.app.blog.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("HibernateDaoSupport")
public class HibernateDaoSupport {
	
	@Autowired
	private SessionFactory sessionFactory;//
	
	public SessionFactory getSessionFactory(){
		return this.sessionFactory;
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
