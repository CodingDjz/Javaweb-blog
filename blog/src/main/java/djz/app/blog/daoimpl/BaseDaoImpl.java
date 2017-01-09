package djz.app.blog.daoimpl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import djz.app.blog.dao.BaseDao;

@SuppressWarnings("all")
@Repository("baseDao")
@Transactional
public class BaseDaoImpl<T> implements BaseDao<T> {

	private Class<T> clazz; 
	@Autowired
	private SessionFactory sessionFactory;

	public BaseDaoImpl() {

//		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();
//		clazz = (Class<T>) type.getActualTypeArguments()[0];
//		System.out.println("DAO的实现类是：" + this.clazz.getName());
	}

	/**
	 * 获得会话工厂
	 * 
	 * @return
	 */
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	/**
	 * 获得当前会话
	 * 
	 * @return
	 */
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public Serializable save(T entity) {
		return this.getCurrentSession().save(entity);
	}

	@Override
	public void update(T entity) {
		this.getCurrentSession().update(entity);

	}

	/**
	 * 先加载出对象再删除
	 */
	@Override
	public void delete(Serializable id) {
		this.getCurrentSession().delete(this.findById(id));

	}

	@Override
	public T findById(Serializable id) {
		return this.getCurrentSession().get(this.clazz, id);
	}

	/**
	 * 通过HQL进行查询
	 */

	@Override
	public List<T> findByHQL(String hql, Object... params) {
		Query<T> query = this.getCurrentSession().createQuery(hql);
		for (int i = 0; params != null && i < params.length; i++) {
			query.setParameter(i, params[i]);
		}
		return query.list();
	}

	public Class<T> getClazz() {
		return clazz;
	}

	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
