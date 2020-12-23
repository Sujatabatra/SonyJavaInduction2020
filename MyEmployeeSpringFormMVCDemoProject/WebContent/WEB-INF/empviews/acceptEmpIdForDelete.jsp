<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee Project</h1>
<spring:form action="./deleteEmployee" method="post">
	Select Employee Id for deletion:<spring:select path="empId">
	<spring:option value=" ">Select Employee ID</spring:option>
	<spring:options items="${empIds }"/>
	</spring:select> <br><br>
	<input type="submit" value="Delete Employee"><br><br>
</spring:form>
<a href="./">Go Back</a>
</body>
</html>