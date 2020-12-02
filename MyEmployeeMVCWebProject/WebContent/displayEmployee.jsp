<%@page import="com.sujata.model.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
<style type="text/css">
table {
	background-color: gray;
}

body {
	background-color: maroon;
}

h1 {
	color: white;
	text-align: center;
}
</style>
</head>
<body>
	<%@include file="header.jsp"%>
	<h1>Employee Details</h1>
	<%
		Employee emp = (Employee) session.getAttribute("emp");
		if (emp == null) {
	%>
	<h1>Employee does not exist!!</h1>
	<%
		} else {
	%>
	<table border="1">
		<tr>
			<td>Employee Id</td>
			<td>Employee Name</td>
			<td>Designation</td>
			<td>Department</td>
			<td>Salary</td>
		</tr>
		<tr>
			<td>
				<%
					out.println(emp.getEmpId());
				%>
			</td>
			<td>
				<%
					out.println(emp.getEmpName());
				%>
			</td>
			<td>
				<%
					out.println(emp.getEmpDesig());
				%>
			</td>
			<td>
				<%
					out.println(emp.getEmpDeptt());
				%>
			</td>
			<td>
				<%
					out.println(emp.getEmpSalary());
				%>
			</td>
		</tr>
	</table>
	<%
		}
	%>
	<br>
	<br>
	<a href="index.jsp">Go back</a>
	<br>
	<br>
	<br>
	<%@include file="footer.jsp"%>
</body>
</html>