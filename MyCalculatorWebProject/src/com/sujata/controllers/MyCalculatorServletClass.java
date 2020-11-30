package com.sujata.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sujata.model.service.CalculatorService;
import com.sujata.model.service.CalculatorServiceImpl;

public class MyCalculatorServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private CalculatorService calculatorService=new CalculatorServiceImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int number1=Integer.parseInt(request.getParameter("no1"));
		int number2=Integer.parseInt(request.getParameter("no2"));
		String op=request.getParameter("operator");
		int result=0;
		String msg=null;
		switch(op){
		case "+":
			msg="Add";
			result=calculatorService.add(number1, number2);
			break;
		case "-":
			msg="Difference";
			result=calculatorService.subtract(number1, number2);
			break;
		case "*":
			msg="Product";
			result=calculatorService.multiply(number1, number2);
			break;
		case "/":
			msg="Divide";
			result=calculatorService.divide(number1, number2);
			break;
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("./result?res="+result+"&message="+msg);
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
