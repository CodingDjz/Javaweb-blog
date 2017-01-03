package djz.app.blog.serviceimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import djz.app.blog.dao.AdminDao;
import djz.app.blog.model.Admin;
import djz.app.blog.service.AdminService;

@Service("adminService")
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService {

	@Resource(name = "adminDao")
	AdminDao adminDao;
	Admin currentAdmin;

	/**
	 * 验证用户登录
	 * 
	 * @param admin
	 * @return
	 */
	@Override
	public boolean validateAdmin(Admin admin) {
		String hql = "FROM Admin Where account=? AND password=?";
		String[] params = { admin.getAccount(), admin.getPassword() };
		List<Admin> admins = adminDao.findByHQL(hql, params);
		if (admins.isEmpty()) {
			return false;
		}
		this.currentAdmin = admins.get(0);
		return true;
	}

	/**
	 * 用户登录
	 * 
	 * @param admin
	 * @return
	 */
	@Override
	public Admin login(Admin admin) {
		boolean valiFlag = validateAdmin(admin);
		if (valiFlag == false) {
			return null;
		} else {
			return currentAdmin;
		}
	}

	/**
	 * 用户注册
	 * 
	 * @param admin
	 * @return
	 */
	@Override
	public boolean regist(Admin admin) {
		String hql = "FROM admin WHERE account=?";
		String[] params = { admin.getAccount() };
		ArrayList<Admin> admins = (ArrayList<Admin>) adminDao.findByHQL(hql, params);
		if (!admins.isEmpty()) {
			return false;
		}
		Serializable id = adminDao.save(admin);
		return true;
	}

}
