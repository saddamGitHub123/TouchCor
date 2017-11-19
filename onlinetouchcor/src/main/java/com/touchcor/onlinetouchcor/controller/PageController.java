package com.touchcor.onlinetouchcor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", "welcome to spring web mvc ");
		
		//mv.addObject("title", "Home");
		
		//passing the list of categories
		//mv.addObject("categories",categoryDAO.list());
		
		//mv.addObject("userClickHome", true);
		
		return mv;
	}

}
