package com.sujata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyDemoController {

	@RequestMapping("/")
	public ModelAndView myFirst(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Hello everyone welcome the world of spring MVC!");
		mv.setViewName("myindex.jsp");
		return mv;
	}
}
