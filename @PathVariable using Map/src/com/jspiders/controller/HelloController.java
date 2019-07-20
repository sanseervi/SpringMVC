package com.jspiders.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	@RequestMapping("/AnyName")    		/*this is used to specify the spring to map 
										with this class if there is multiple class
										in a single package*/
	public class HelloController {
		@RequestMapping("/welcome/{userName}/{value}")
		public ModelAndView helloworld(@PathVariable Map<String,String>pathVars) {
			ModelAndView mav=new ModelAndView("HelloPage");
			mav.addObject("msg", "Hi i am "+pathVars.get("userName")+" and i am "+pathVars.get("value"));
			return mav;
		}
		
		@RequestMapping("/welcome1")
		public ModelAndView helloworld1() {
			ModelAndView mav=new ModelAndView("HelloPage");
			mav.addObject("msg", "HelloWorld1");
			return mav;
		}
}

	
	