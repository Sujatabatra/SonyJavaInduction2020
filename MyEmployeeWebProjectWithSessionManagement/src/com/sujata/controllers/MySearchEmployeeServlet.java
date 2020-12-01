package com.sujata.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sujata.model.bean.Employee;
import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.EmployeeServiceImpl;

public class MySearchEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService empService=new EmployeeServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		String id=request.getParameter("empId");
		
		Employee employee=null;
		try {
			employee=empService.searchEmployeeById(Integer.parseInt(id));
			
		} catch (NumberFormatException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		
		session.setAttribute("emp", employee);
		response.sendRedirect("./displayEmp");
//		response.encodeRedirectURL("./displayEmp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
