package com.sujata.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sujata.model.bean.Employee;
import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.EmployeeServiceImpl;

public class MyInsertEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeService empService=new EmployeeServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String desig=request.getParameter("desig");
		String deptt=request.getParameter("deptt");
		String salary=request.getParameter("salary");
		
		Employee employee=new Employee(Integer.parseInt(id), name, desig, deptt, Double.parseDouble(salary));
		
		String message=null;
		int rows=0;
		try {
			rows=empService.insertEmployee(employee);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(rows>0)
			message ="Employee Added!";
		else
			message="Employee not Added!";
		
		session.setAttribute("msg", message);
		
//		response.encodeRedirectURL("./output");
		response.sendRedirect("./output");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
