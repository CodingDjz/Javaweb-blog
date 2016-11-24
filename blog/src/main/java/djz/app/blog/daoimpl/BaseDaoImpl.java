package com.xw.utils.base.dao.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xw.utils.base.dao.BaseDao;
import com.xw.utils.base.dao.ParamMap;

@Repository("BaseDao")
@SuppressWarnings("all")
//public class BaseDaoImpl<T>{
//
//	@Autowired
//	private SessionFactory sessionFactory;//
//	
//	public SessionFactory getSessionFactory(){
//		return this.sessionFactory;
//	}
//	
//	public Session getCurrentSession() {
//		return sessionFactory.getCurrentSession();
//	}
//
//	public Serializable save(T o) {
//		return this.getCurrentSession().save(o);
//	}
//
//	public Object merge(T o) {
//		return this.getCurrentSession().merge(o);
//	}
//
//	public void delete(T o) {
//		this.getCurrentSession().delete(o);
//
//	}
//
//	public void deleteById(Class<T> c, Integer id) {
//		T t = this.get(c, id);
//		if (null != t) {
//			this.delete(t);
//		}
//
//	}
//
//	public void deleteByClaseName(String className, Integer id) {
//		StringBuffer hql = new StringBuffer("delete ");
//		hql.append("" + className + "");
//		hql.append("   WHERE  id=" + id);
//		this.getCurrentSession().createQuery(hql.toString()).executeUpdate();
//
//	}
//
//	public void deleteByName(String className, String idname, Integer id) {
//		StringBuffer hql = new StringBuffer("delete ");
//		hql.append("" + className + "");
//		hql.append("   WHERE  " + idname + "=" + id);
//		this.getCurrentSession().createQuery(hql.toString()).executeUpdate();
//
//	}
//
//	public void update(T o) {
//		this.getCurrentSession().update(o);
//
//	}
//
//	public void saveOrUpdate(T o) {
//		this.getCurrentSession().saveOrUpdate(o);
//
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> find(String hql) {
//
//		return this.getCurrentSession().createQuery(hql).list();
//	}
//
//	@Override
//	public T get(Class<T> c, String field, String fieldValue) {
//		String hql = new String("from  " + c.getName() + " as ccc where ccc."
//				+ field + "=" + fieldValue);
//
//		List<T> list = this.getCurrentSession().createQuery(hql).list();
//		if (null != list && list.size() > 0) {
//			return (T) list.get(0);
//		}
//		return null;
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> find(String hql, Object[] param) {
//		Query q = this.getCurrentSession().createQuery(hql);
//		if (param != null && param.length > 0) {
//			for (int i = 0; i < param.length; i++) {
//				q.setParameter(i, param[i]);
//			}
//		}
//		return q.list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> find(String hql, List<Object> param) {
//		Query q = this.getCurrentSession().createQuery(hql);
//		if (param != null && param.size() > 0) {
//			for (int i = 0; i < param.size(); i++) {
//				q.setParameter(i, param.get(i));
//			}
//		}
//		return q.list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> findMap(String hql, Map<String, ParamMap> param) {
//		Query q = spliceQuery(hql, param);
//		return (List<T>) q.list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public T getByMap(String hql, Map<String, ParamMap> param) {
//		Query q = spliceQuery(hql, param);
//		return (T) q.uniqueResult();
//
//	}
//
//	public List<T> findMap(String hql, Map<String, ParamMap> param, int page,
//			int pagesize) {
//		Query q = spliceQuery(hql, param);
//		if (0 == pagesize) {
//			return this.findMap(hql, param);
//
//		} else {
//
//			if (page < 1) {
//				page = 1;
//			}
//
//		}
//
//		return q.setFirstResult((page - 1) * pagesize).setMaxResults(pagesize)
//				.list();
//	}
//
//	public Long countMap(String hql, Map<String, ParamMap> param) {
//		Query q = spliceQuery(hql, param);
//
//		return (Long) q.uniqueResult();
//	}
//
//	/**
//	 * @param hql
//	 * @param param
//	 * @return
//	 */
//	@SuppressWarnings("unchecked")
//	private Query spliceQuery(String hql, Map<String, ParamMap> param) {
//		Query q = this.getCurrentSession().createQuery(hql);
//
//		if (null != param && false == param.isEmpty()) {
//			for (Map.Entry<String, ParamMap> entry : param.entrySet()) {
//				if ("String".equals(entry.getValue().getType())) {
//					q.setString(entry.getValue().getName(), (String) entry
//							.getValue().getValue());
//				}
//				if ("Integer".equals(entry.getValue().getType())) {
//					q.setInteger(
//							entry.getValue().getName(),
//							Integer.parseInt(entry.getValue().getValue()
//									.toString()));
//				}
//				if ("Float".equals(entry.getValue().getType())) {
//					q.setFloat(
//							entry.getValue().getName(),
//							Float.parseFloat(entry.getValue().getValue()
//									.toString()));
//				}
//				if ("Double".equals(entry.getValue().getType())) {
//					q.setDouble(
//							entry.getValue().getName(),
//							Double.parseDouble(entry.getValue().getValue()
//									.toString()));
//				}
//				if ("Date".equals(entry.getValue().getType())) {
//					q.setDate(
//							entry.getValue().getName(),
//							java.sql.Date.valueOf(entry.getValue().getValue()
//									.toString()));
//				}
//				if ("Boolean".equals(entry.getValue().getType())) {
//					q.setBoolean(
//							entry.getValue().getName(),
//							(Boolean.parseBoolean(entry.getValue().getValue()
//									.toString())));
//				}
//
//			}
//		}
//
//		return q;
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> find(String hql, Object[] param, Integer page, Integer rows) {
//		if (page == null || page < 1) {
//			page = 1;
//		}
//		if (rows == null || rows < 1) {
//			rows = 10;
//		}
//
//		Query q = this.getCurrentSession().createQuery(hql);
//
//		if (param != null && param.length > 0) {
//			for (int i = 0; i < param.length; i++) {
//				q.setParameter(i, param[i]);
//			}
//		}
//		return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public List<T> find(String hql, List<Object> param, Integer page,
//			Integer rows) {
//		if (page == null || page < 1) {
//			page = 1;
//		}
//		if (rows == null || rows < 1) {
//			rows = 10;
//		}
//		Query q = this.getCurrentSession().createQuery(hql);
//		if (param != null && param.size() > 0) {
//			for (int i = 0; i < param.size(); i++) {
//				q.setParameter(i, param.get(i));
//			}
//		}
//		return q.setFirstResult((page - 1) * rows).setMaxResults(rows).list();
//	}
//
//	@SuppressWarnings("unchecked")
//	public T get(Class<T> c, Serializable id) {
//		return (T) this.getCurrentSession().get(c, id);
//	}
//
//	public T get(String hql, Object[] param) {
//		List<T> l = this.find(hql, param);
//		if (l != null && l.size() > 0) {
//			return l.get(0);
//		} else {
//			return null;
//		}
//	}
//
//	public T get(String hql, List<Object> param) {
//		List<T> l = this.find(hql, param);
//		if (l != null && l.size() > 0) {
//			return l.get(0);
//		} else {
//			return null;
//		}
//	}
//
//	public Long count(String hql) {
//		return (Long) this.getCurrentSession().createQuery(hql).uniqueResult();
//	}
//
//	public Long count(String hql, Object[] param) {
//		Query q = this.getCurrentSession().createQuery(hql);
//		if (param != null && param.length > 0) {
//			for (int i = 0; i < param.length; i++) {
//				q.setParameter(i, param[i]);
//			}
//		}
//		return (Long) q.uniqueResult();
//	}
//
//	public Long count(String hql, List<Object> param) {
//		Query q = this.getCurrentSession().createQuery(hql);
//		if (param != null && param.size() > 0) {
//			for (int i = 0; i < param.size(); i++) {
//				q.setParameter(i, param.get(i));
//			}
//		}
//		return (Long) q.uniqueResult();
//	}
//
//	public Integer executeHql(String hql) {
//		return this.getCurrentSession().createQuery(hql).executeUpdate();
//	}
//
//	public Query createQuery(String hql) {
//		return this.getCurrentSession().createQuery(hql);
//	}
//
//	public Integer executeHql(String hql, Object[] param) {
//		Query q = this.getCurrentSession().createQuery(hql);
//		if (param != null && param.length > 0) {
//			for (int i = 0; i < param.length; i++) {
//				q.setParameter(i, param[i]);
//			}
//		}
//		return q.executeUpdate();
//	}
//
//	public Integer executeHql(String hql, List<Object> param) {
//		Query q = this.getCurrentSession().createQuery(hql);
//		if (param != null && param.size() > 0) {
//			for (int i = 0; i < param.size(); i++) {
//				q.setParameter(i, param.get(i));
//			}
//		}
//		return q.executeUpdate();
//	}
//
//	public T findById(String ClassName, String idName, Integer id) {
//		// return (T)this.getCurrentSession().get(t.getClass(), id);
//		StringBuffer hql = new StringBuffer("from ");
//		hql.append("" + ClassName + "");
//		hql.append("   WHERE " + idName + " =" + id);
//		return (T) this.getCurrentSession().createQuery(hql.toString());
//	}
//
//	@Override
//	public T get(String hql) {
//		return (T) this.getCurrentSession().createQuery(hql).uniqueResult();
//	}
//
//	@Override
//	public List<T> find(String hql, int page, int pagesize) {
//
//		return findMap(hql, null, page, pagesize);
//	}
//
//	@Override
//	public Object getFieldById(String hql) {
//		List<Object> list = this.getCurrentSession().createQuery(hql).list();
//		if (null != list && list.size() == 1) {
//			return list.get(0);
//		} else {
//			return null;
//		}
//
//	}
//
//	@Override
//	public List<Object> getFieldByIds(String hql) {
//		List<Object> list = this.getCurrentSession().createQuery(hql).list();
//		if (null != list && list.size() == 1) {
//			return list;
//		} else {
//			return null;
//		}
//
//	}
//
//	@Override
//	public List<T> findBySql(String sql) {
//
//		return this.getCurrentSession().createSQLQuery(sql).list();
//	}
//
//
//
}
