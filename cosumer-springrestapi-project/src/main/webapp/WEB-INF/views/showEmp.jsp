<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<tr>
		<td>${sessionScope.emp.empId }</td>
		<td>${sessionScope.emp.empName }</td>
		<td>${sessionScope.emp.empDesig }</td>
		<td>${sessionScope.emp.empDeptt }</td>
		<td>${sessionScope.emp.empSalary }</td>
	</tr>
</table>
</body>
</html>