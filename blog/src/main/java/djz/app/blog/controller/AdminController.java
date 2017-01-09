package djz.app.blog.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import djz.app.blog.model.Admin;
import djz.app.blog.service.AdminService;
import djz.app.blog.util.ConstantSet;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Resource(name = "adminService")
	private AdminService adminService;

	/**
	 * 跳转到登录界面
	 * @return
	 */
	@RequestMapping("/loginPage")
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(ConstantSet.LOGIN_VIEW);
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
			mav.addObject(ConstantSet.RESULT_CODE, ConstantSet.LOGIN_SUCCESS);
		} else {
			mav.addObject(ConstantSet.RESULT_CODE, ConstantSet.LOGIN_FAILD);
		}
		mav.setViewName(ConstantSet.ACTION_RESULT_VIEW);
		return mav;
	}
	
	@RequestMapping("/registPage")
	public ModelAndView registPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName(ConstantSet.REGIST_VIEW);
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
			mav.addObject(ConstantSet.RESULT_CODE, ConstantSet.REGIST_SUCCESS);
		} else {
			mav.addObject(ConstantSet.RESULT_CODE, ConstantSet.REGIST_FAILD);
		}
		mav.setViewName(ConstantSet.ACTION_RESULT_VIEW);
		return mav;
	}

}
