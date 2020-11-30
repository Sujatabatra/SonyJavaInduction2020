package com.sujata.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFailureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String uname=request.getParameter("uname");
		pw.println("<html>");
		pw.println("<head><title>Login Page</title></head>");
		pw.println("<body>");
		pw.println("<h1 style=\"color:red\">"+uname+"Login Failed</h1>");
		pw.println("</body>");
		pw.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
