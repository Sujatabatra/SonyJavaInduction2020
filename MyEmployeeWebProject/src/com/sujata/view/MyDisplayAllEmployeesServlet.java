package com.sujata.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sujata.model.bean.Employee;


public class MyDisplayAllEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		List<Employee> employees=(List<Employee>)request.getAttribute("employees");
		out.println("<html>");
		out.println("<head><title>Employee Details</title></head>");
		out.println("<body>");
		out.println("<table border=\"1\">");
		out.println("<tr>");
		out.println("<td>Employee ID</td>");
		out.println("<td>Employee Name</td>");
		out.println("<td>Employee Designation</td>");
		out.println("<td>Employee Department</td>");
		out.println("<td>Employee Salary</td>");
		out.println("</tr>");
		for(Employee emp:employees){
			out.println("<td>"+emp.getEmpId()+"</td>");
			out.println("<td>"+emp.getEmpName()+"</td>");
			out.println("<td>"+emp.getEmpDesig()+"</td>");
			out.println("<td>"+emp.getEmpDeptt()+"</td>");
			out.println("<td>"+emp.getEmpSalary()+"</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		
		out.println("<a href=\"index.html\">Go back</a>");
		out.println("</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
