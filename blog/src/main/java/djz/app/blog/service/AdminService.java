package djz.app.blog.service;

import djz.app.blog.model.Admin;

public interface AdminService extends BaseService<Admin> {
	boolean validateAdmin(Admin admin);

	Admin login(Admin admin);

	boolean regist(Admin admin);
	
//	void updateMD5Password(Admin admin);
}
