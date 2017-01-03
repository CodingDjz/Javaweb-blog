package djz.app.blog.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import djz.app.blog.model.Admin;
import djz.app.blog.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Resource(name = "adminService")
	private AdminService adminService;
	
	@RequestMapping("/loginPage")
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}

	/**
	 * 用户登录
	 * 
	 * @param admin
	 */
	@RequestMapping("/login")
	public ModelAndView login(Admin admin) {
		ModelAndView mav = new ModelAndView();
		Admin currentAdmin = adminService.login(admin);
		if (currentAdmin != null) {
			mav.addObject("status_msg", "登录失败，请重新尝试！");
		} else {
			mav.addObject("status_msg", "登陆成功！");
		}
		// TODO 返回界面
		return mav;
	}

	/**
	 * 用户注册
	 * 
	 * @param admin
	 * @return
	 */
	@RequestMapping("/regist")
	public ModelAndView regist(Admin admin) {
		ModelAndView mav = new ModelAndView();
		boolean registFlag = adminService.regist(admin);
		if (registFlag) {
			mav.addObject("status_msg", "注册成功！");
		} else {
			mav.addObject("status_msg", "注册失败！");
		}
		mav.setViewName("operation_result");
		return mav;
	}

}
