package com.sujata.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sujata.model.bean.Employee;
import com.sujata.model.service.EmployeeService;
import com.sujata.model.service.EmployeeServiceImpl;

public class MySearchAllEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private EmployeeService empService = new EmployeeServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		List<Employee> employees=null;
		try {
			employees=empService.getAllEmployees();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		session.setAttribute("employees", employees);
		RequestDispatcher dispatcher=request.getRequestDispatcher(response.encodeRedirectURL("./displayAllEmps"));
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
