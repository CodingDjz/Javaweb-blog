package djz.app.blog.daoimpl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import djz.app.blog.dao.AdminDao;
import djz.app.blog.model.Admin;

@Transactional
@Repository("adminDao")
public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao {

}
