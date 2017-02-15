package djz.app.blog.daoimpl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.swing.text.html.HTML.Tag;

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
	private String Tag = null;
	@Autowired
	private SessionFactory sessionFactory;

	public BaseDaoImpl() {
		Type type = this.getClass().getGenericSuperclass();
		// 要使用判定，因为第一个对象是BaseDaoImpl，这个不能进行强转（父类是obj）
		if (type instanceof ParameterizedType) {
			ParameterizedType parameterizedType = (ParameterizedType) type;
			clazz = (Class<T>) parameterizedType.getActualTypeArguments()[0];
			System.out.println("DAO的实现类是：" + this.clazz.getName());
		} else {
			Tag = "elsetag";
		}
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

	/**
	 * 通过主键获得对象
	 * 
	 * @param id
	 * @return
	 */
	@Override
	public T findById(Serializable id) {
		if (clazz == null) {
			return null;
		}
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
