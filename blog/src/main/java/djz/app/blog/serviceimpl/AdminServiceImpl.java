package djz.app.blog.serviceimpl;

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

	@Override
	public Admin login(Admin admin) {
		boolean valiFlag = validateAdmin(admin);
		if (valiFlag == false) {
			return null;
		} else {
			return currentAdmin;
		}
	}

}
