package com.sujata.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyDemoController {

	@RequestMapping("/")
	public ModelAndView myFirstController(){
		ModelAndView mv=new ModelAndView();
		String message="Welcome to the world of Spring MVC!";
		mv.addObject("msg",message);
		mv.setViewName("myindex.jsp");
		return mv;
	}
	
	@RequestMapping("/second")
	public ModelAndView mySecondController(){
		ModelAndView mv=new ModelAndView();
		String message="Welcome again to the world of Spring MVC!";
		mv.addObject("msg",message);
		mv.setViewName("myindex.jsp");
		return mv;
	}
}
