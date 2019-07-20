package com.jspiders.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	@RequestMapping("/AnyName/Again") /*this is used to specify the spring to map 
										with this class if there is multiple class
										in a single package*/
	public class HelloController {
		@RequestMapping("/welcome")
		public ModelAndView helloworld() {
			ModelAndView mav=new ModelAndView("HelloPage");
			mav.addObject("msg", "HelloWorld");
			return mav;
		}
		
		@RequestMapping("/welcome1")
		public ModelAndView helloworld1() {
			ModelAndView mav=new ModelAndView("HelloPage");
			mav.addObject("msg", "HelloWorld1");
			return mav;
		}
}
