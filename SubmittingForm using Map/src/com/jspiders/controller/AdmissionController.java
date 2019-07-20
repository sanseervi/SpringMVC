package com.jspiders.controller;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

	@Controller
//	@RequestMapping("/AnyName") 

public class AdmissionController {
			@RequestMapping(value="/admissionform.html",method=RequestMethod.GET)
			public ModelAndView helloworld() 
			{
				ModelAndView mav=new ModelAndView("AdmissionForm");
				return mav;
			}
			
			@RequestMapping(value="/submitAdmissionForm.html",method=RequestMethod.POST)
			public ModelAndView helloworld1(@RequestParam Map<String,String> reqParam) {
				ModelAndView mav=new ModelAndView("AdmissionSuccess");
				String data="Name : "+ reqParam.get("studentName") +
							" Hobby : "+reqParam.get("studentHobby");
				mav.addObject("msg", data);
				return mav;
				
		}
}
