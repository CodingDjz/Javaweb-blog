package djz.app.blog.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
	Serializable save(T entity);

	boolean update(T entity);

	boolean delete(Serializable id);

	T findById(Serializable id);

	List<T> findByHQL(String hql, Object... params);
}
