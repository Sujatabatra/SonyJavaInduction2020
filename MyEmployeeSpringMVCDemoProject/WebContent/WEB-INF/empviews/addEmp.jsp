<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./addEmployee" method="post">
Enter Employee Id :<input type="text" name="id"><br><br>
Enter Employee Name :<input type="text" name="name"><br><br>
Enter Employee Designation :<input type="text" name="desig"><br><br>
Enter Employee Department :<input type="text" name="deptt"><br><br>
Enter Employee Salary :<input type="text" name="salary"><br><br>
<input type="submit" value="Save Employee">
</form>
<br><br>
<a href="./">Go Back</a>
</body>
</html>