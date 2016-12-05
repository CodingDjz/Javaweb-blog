package djz.app.blog.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
	public Serializable save(T entity);

	public boolean update(T entity);

	public boolean delete(Serializable id);

	public T findById(Serializable id);

	public List<T> findByHQL(String hql, Object... params);
}
