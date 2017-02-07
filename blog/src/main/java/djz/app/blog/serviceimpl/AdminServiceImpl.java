package djz.app.blog.serviceimpl;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import djz.app.blog.dao.AdminDao;
import djz.app.blog.model.Admin;
import djz.app.blog.service.AdminService;
import djz.app.blog.util.AdminUtil;

/**
 * 登录注册 拦截器验证
 * 
 * @author Administrator
 *
 */
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
		String hql = "FROM Admin a WHERE a.account=? AND a.password=?";
		String[] params = { admin.getAccount(), admin.getPassword() };
		ArrayList<Admin> admins = (ArrayList<Admin>) adminDao.findByHQL(hql, params);
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
		updateMD5Password(admin);
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
		updateMD5Password(admin);
		String hql = "FROM Admin WHERE account=?";
		String[] params = { admin.getAccount() };
		ArrayList<Admin> admins = (ArrayList<Admin>) adminDao.findByHQL(hql, params);
		if (!admins.isEmpty()) {
			return false;
		}
		Serializable id = adminDao.save(admin);
		return true;
	}

	/**
	 * 将Admin密码通过MD5加密
	 * 
	 * @param admin
	 */
	@Override
	public void updateMD5Password(Admin admin) {
		try {
			String MD5Password = AdminUtil.MD5Encode(admin.getPassword());
			admin.setPassword(MD5Password);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

	}

}
