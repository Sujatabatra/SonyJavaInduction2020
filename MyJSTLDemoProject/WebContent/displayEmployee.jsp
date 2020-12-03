<%@page import="com.sujata.model.bean.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>

</head>
<body>

	<h1>Employee Details</h1>

	<c:if test="${sessionScope.emp==null}">
		<h1>Employee does not exist!!</h1>
	</c:if>

	<c:if test="${sessionScope.emp!=null }">
		<table border="1">
			<tr>
				<td>Employee Id</td>
				<td>Employee Name</td>
				<td>Designation</td>
				<td>Department</td>
				<td>Salary</td>
			</tr>
			<tr>
				<td>${emp.empId }</td>
				<td>${emp.empName }</td>
				<td>${emp.empDesig}</td>
				<td>${emp.empDeptt }</td>
				<td>${emp.empSalary }</td>
			</tr>
		</table>
	</c:if>
	<br>
	<br>

	<c:choose>
		<c:when test="${sessionScope.emp==null}">
			<h1>Employee does not exist!!</h1>
		</c:when>
		<c:when test="${sessionScope.emp!=null }">
			<table border="1">
				<tr>
					<td>Employee Id</td>
					<td>Employee Name</td>
					<td>Designation</td>
					<td>Department</td>
					<td>Salary</td>
				</tr>
				<tr>
					<td>${emp.empId }</td>
					<td>${emp.empName }</td>
					<td>${emp.empDesig}</td>
					<td>${emp.empDeptt }</td>
					<td>${emp.empSalary }</td>
				</tr>
			</table>
		</c:when>
		<c:otherwise>
			<h1>This is the default case!</h1>
		</c:otherwise>
	</c:choose>
	<br><br>
	
	
	<a href="index.jsp">Go back</a>
	<br>
	<br>
	<br>



</body>
</html>