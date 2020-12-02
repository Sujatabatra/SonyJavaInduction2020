<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./insertBook.jsp" method="post">
	Enter Book Id : <input type="text" name="bookId"><br><br>
	Enter Book Name : <input type="text" name="bookName"><br><br>
	Enter author Name : <input type="text" name="authorName"><br><br>
	Enter price : <input type="text" name="price"><br><br>
	Enter No of Papges in a Book : <input type="text" name="noOfPages"><br><br>
	<input type="submit" value="save">
</form>
</body>
</html>