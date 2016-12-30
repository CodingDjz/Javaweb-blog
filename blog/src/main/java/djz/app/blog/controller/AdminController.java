package djz.app.blog.controller;

import java.util.concurrent.BlockingDeque;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import djz.app.blog.model.Admin;
import djz.app.blog.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Resource(name = "adminService")
	private AdminService adminService;

	@RequestMapping("/login")
	public void login(Admin admin) {
		Admin currentAdmin = adminService.login(admin);
		if (currentAdmin!=null) {
			// TODO 登陆成功
		} else {
			// TODO 登录失败
		}
	}

	@RequestMapping("/regist")
	public void regist(Admin admin) {

	}

}
