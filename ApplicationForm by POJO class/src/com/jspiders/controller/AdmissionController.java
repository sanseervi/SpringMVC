package com.jspiders.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class AdmissionController {
	@RequestMapping(value="/admissionForm.html",method= RequestMethod.GET)	
	public ModelAndView helloworld() {
		
		
		ModelAndView mav=new ModelAndView("AdmissionForm");
		
		return mav;
	}
	
	@RequestMapping(value="/submitAdmissionForm.html",method= RequestMethod.POST)	
	public ModelAndView helloworld1(@RequestParam("studentName") String name,@RequestParam("studentHobby") String hobby) {
		
		
		ModelAndView mav=new ModelAndView("AdmissionSuccess");
		mav.addObject("msg","Details submitted by you :");
		
		
		Student s1 = new Student();
		s1.setName(name);
		s1.setHobby(hobby);
		mav.addObject("student1",s1);
		
		return mav;
	}

}
