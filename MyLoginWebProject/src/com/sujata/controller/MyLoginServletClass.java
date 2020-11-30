package com.sujata.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
	
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String userName=request.getParameter("uname");
		String password=request.getParameter("pwd");
		User user=new User(userName, password);
		String message=null;
		
		if(userService.authenticateUser(user))
			message="Login Sucessful";
		else
			message="Login Failed";
		
		pw.println("<html>");
		pw.println("<head><title>Login Page</title></head>");
		pw.println("<body>");
		pw.println("<h1>"+message+"</h1>");
		pw.println("</body>");
		pw.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);		
	}

}
