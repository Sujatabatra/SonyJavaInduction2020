package com.sujata.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sujata.model.bean.User;
import com.sujata.model.service.UserLoginService;

@Controller
public class LoginController {

	@Autowired
	private UserLoginService loginService;
	
	@RequestMapping("/")
	public ModelAndView mainPageController(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("/login")
	public ModelAndView loginCheckController(HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		User user=new User(username, password);
		String message=null;
		if(loginService.loginCheck(user))
			message="Login Successful !";
		else 
			message="Login Failed !";
		
		//adding attribute on request scope
		mv.addObject("message", message);
		mv.setViewName("result");
		return mv;
	}
}
