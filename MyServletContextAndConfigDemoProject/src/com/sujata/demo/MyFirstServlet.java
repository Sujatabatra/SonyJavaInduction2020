package com.sujata.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		ServletContext context=request.getServletContext();
		ServletConfig config=getServletConfig();
		
		String name=config.getInitParameter("name");
		String college=config.getInitParameter("college");
		
		String globalName=context.getInitParameter("name");
		String globalCollege=context.getInitParameter("college");
		
		pw.println("<html>");
		pw.println("<head><title>First Servlet</title></head>");
		pw.println("<body>");
		pw.println("<p> Servlet Specific name : "+name);
		pw.println("<p> Servlet Specific college : "+college);
		pw.println("<p> Application Specific name : "+globalName);
		pw.println("<p> Application Specific college : "+globalCollege);
		pw.println("</body>");
		pw.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
