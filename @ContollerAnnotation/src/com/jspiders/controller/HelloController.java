package com.jspiders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/welcome")
	public ModelAndView helloworld() {
		ModelAndView mav=new ModelAndView("HelloPage");
		mav.addObject("msg", "HelloWorld");
		return mav;
	}
	
}
