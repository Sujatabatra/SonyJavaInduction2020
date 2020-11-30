package com.sujata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sujata.model.bean.User;
import com.sujata.model.service.UserService;
import com.sujata.model.service.UserServiceImpl;

public class MyLoginServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService=new UserServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String userName=request.getParameter("uname");
		String password=request.getParameter("pwd");
		User user=new User(userName, password);
		
		
		
		if(userService.authenticateUser(user)){
		    //we can see url changing
			//2 request response cycles 
			response.sendRedirect("./success");
		}else{
			
		     //url is not changing
			//1 request response cycle
			RequestDispatcher dispatcher=request.getRequestDispatcher("./failure");
			dispatcher.forward(request, response);
		}
			
		
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
	
}

}
