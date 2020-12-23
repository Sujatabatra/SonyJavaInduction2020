<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<spring:form action="./addEmployee" method="post" modelAttribute="emp">
		Enter Employee Id : <spring:input path="empId" />
		<br>
		<br>
		Enter Employee Name :<spring:input path="empName" />
		<br>
		<br>
		Enter Employee Designation :<spring:select path="empDesig">
			<spring:options items="${ designations}" />
		</spring:select>
		<br>
		<br>
		Enter Employee Department :<spring:radiobuttons path="empDeptt"
			items="${departments }" />
		<br>
		<br>
		Enter Employee Salary :<spring:input path="empSalary" />
		<br>
		<br>
		<input type="submit" value="Save Employee">
	</spring:form>
	<br>
	<br>
	<a href="./">Go Back</a>
</body>
</html>