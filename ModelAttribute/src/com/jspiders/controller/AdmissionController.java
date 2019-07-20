package com.jspiders.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AdmissionController {
	@RequestMapping(value="/admissionForm.html",method= RequestMethod.GET)	
	public ModelAndView helloworld() {
		
		
		ModelAndView mav=new ModelAndView("AdmissionForm");
		
		return mav;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method= RequestMethod.POST)	
	public ModelAndView helloworld1(@ModelAttribute("student1") Student student1) {
		
		
		ModelAndView mav=new ModelAndView("AdmissionSuccess");
		mav.addObject("msg","Details submitted by you :");
		
		return mav;
	}

}
