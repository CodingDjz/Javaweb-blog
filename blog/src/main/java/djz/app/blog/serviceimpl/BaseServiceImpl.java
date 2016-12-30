package djz.app.blog.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import djz.app.blog.dao.BaseDao;
import djz.app.blog.service.BaseService;

public class BaseServiceImpl<T> implements BaseService<T> {
	@Resource(name="baseDao")
	private BaseDao<T> dao;

	@Override
	public Serializable save(T entity) {
		return dao.save(entity);
	}

	@Override
	public boolean update(T entity) {
		try {
			dao.update(entity);
			return true;
		} catch (Exception e) {
			return true;
		}

	}

	@Override
	public boolean delete(Serializable id) {
		try {
			dao.delete(id);
			return true;
		} catch (Exception e) {
			return true;
		}

	}

	@Override
	public T findById(Serializable id) {
		return dao.findById(id);
	}

	@Override
	public List<T> findByHQL(String hql, Object... params) {
		return dao.findByHQL(hql, params);
	}

	public BaseDao<T> getDao() {
		return dao;
	}

	public void setDao(BaseDao<T> dao) {
		this.dao = dao;
	}

}
