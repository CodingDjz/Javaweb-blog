package djz.app.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import djz.app.blog.util.ConstantSet;

@Controller
@RequestMapping("/handle")
public class HandleController {
	@RequestMapping("/developing")
	public ModelAndView moduleOnDeveloping() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(ConstantSet.MODULE_DEVELOPING);
		return mav;
	}
}
