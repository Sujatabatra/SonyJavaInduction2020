package com.sujata.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MySecondServletClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Dynamic Response</title><head>");
		pw.println("<body>");
		pw.println("<h1 style=\"color:blue\"> Today's Date is : "+new Date()+"</h1>");
		pw.println("</body>");
		pw.println("</html>");
		
	}


}
