<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp" %>
<form action="./insertEmp">
Enter Employee ID : <input type="text" name="id"><br><br>
Enter Employee Name : <input type="text" name="name"><br><br>
Enter Employee Designation : <input type="text" name="desig"><br><br>
Enter Employee Department :  <input type="text" name="deptt"><br><br>
Enter Employee Salary : <input type="text" name="salary"><br><br>
<input type="submit" value="Insert">
</form>
<br><br><br>
<%@include file="footer.jsp" %>
</body>
</html>