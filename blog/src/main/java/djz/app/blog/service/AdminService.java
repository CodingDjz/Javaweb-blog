package djz.app.blog.service;

import djz.app.blog.model.Admin;

public interface AdminService extends BaseService<Admin> {
	public boolean validateAdmin(Admin admin);

	public Admin login(Admin admin);

	public boolean regist(Admin admin);
	
	public void updateMD5Password(Admin admin);
}
