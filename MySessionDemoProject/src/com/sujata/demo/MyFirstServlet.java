package com.sujata.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//if session is already there pick the session otherwise create the new one
		HttpSession session=request.getSession();
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>First Page for session Management</title></head>");
		out.println("<body>");
		out.println("<p>Session id : "+session.getId()+"</p>");
		out.println("<p>Session Creation Time : "+session.getCreationTime()+"</p>");
		out.println("<p>Session timeout time : "+session.getMaxInactiveInterval()+"</p>");
		out.println("<p>Session New Status : "+session.isNew()+"</p>");
		out.println("<a href=\""+response.encodeURL("./second")+"\">Go To second page</a>");
		out.println("</body>");
		out.println("</html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
