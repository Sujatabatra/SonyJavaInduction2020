<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Project</h1>
	<table border="1">
		<tr>
			<td>Employee ID</td>
			<td>Employee Name</td>
			<td>Deignation</td>
			<td>Department</td>
			<td>Salary</td>
		</tr>
		<c:forEach items="${empList}" var="employee">
		<tr>
			<td>${employee.empId }</td>
			<td>${employee.empName }</td>
			<td>${employee.empDesig }</td>
			<td>${employee.empDeptt }</td>
			<td>${employee.empSalary }</td>
		</tr>
		</c:forEach>
	</table>
<br><br>
<a href="./">Go Back</a>
</body>
</html>