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
<spring:form method="post" action="./perform" modelAttribute="numbers">
	Enter First No : <spring:input path="number1"/><br><br>
	Enter Second No : <spring:input path="number2"/><br><br>
	<input type="submit" name="operator" value="Add">
	<input type="submit" name="operator" value="Difference">
	<input type="submit" name="operator" value="Product">
	<input type="submit" name="operator" value="Divide">
</spring:form>
</body>
</html>