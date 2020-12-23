package com.sujata.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public ModelAndView myFirstController(HttpSession session){
		ModelAndView mv=new ModelAndView();
		//request Scope
		mv.addObject("message", "Welcome to the world of Spring Boot MVC");
		//session scope
		session.setAttribute("message", "Hi I am session message");
		mv.setViewName("index");
		return mv;
	}
}
