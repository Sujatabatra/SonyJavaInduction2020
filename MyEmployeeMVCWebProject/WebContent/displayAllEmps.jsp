<%@page import="com.sujata.model.bean.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
<%@include file="header.jsp" %>

<% List<Employee> employees=(List<Employee>)session.getAttribute("employees"); %>
<table>
	<tr>
		<td>Employee Id</td>
		<td>Employee Name</td>
		<td>Designation</td>
		<td>Department</td>
		<td>Salary</td>
	</tr>
	<% for(Employee emp:employees){ %>
	<tr>
	<td><% out.println(emp.getEmpId()); %></td>
	<td><% out.println(emp.getEmpName()); %></td>
	<td><% out.println(emp.getEmpDesig()); %></td>
	<td><% out.println(emp.getEmpDeptt()); %></td>
	<td><% out.println(emp.getEmpSalary()); %></td>
	</tr>
	<%} %>
</table>
<br><br>
<a href="index.jsp">Go back</a>
<br><br><br>
<%@include file="footer.jsp" %>
</body>
</html>