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
	<table border="1">
		<tr>
			<td>Employee Id</td>
			<td>Employee Name</td>
			<td>Designation</td>
			<td>Department</td>
			<td>Salary</td>
		</tr>
		<c:forEach items="${sessionScope.emps }" var="emp">
			<tr>
				<td>${emp.empId }</td>
				<td>${emp.empName }</td>
				<td>${emp.empDesig }</td>
				<td>${emp.empDeptt }</td>
				<td>${emp.empSalary }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>