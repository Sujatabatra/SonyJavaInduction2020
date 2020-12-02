<%@page import="com.sujata.model.bean.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="book" class="com.sujata.model.bean.Book" scope="session"></jsp:useBean>
 <%// Book book=(Book)session.getAttribute("book"); %>

<table border="1">
	<tr>
		<td>Book ID</td>
		<td>Book Name</td>
		<td>Author Name</td>
		<td>Price</td>
		<td>No of Pages</td>
	</tr>
	<tr>
		<td><%= book.getBookId() %></td>
		<td><%= book.getBookName() %></td>
		<td><%= book.getAuthorName() %></td>
		<td><%= book.getPrice() %></td>
		<td><%= book.getNoOfPages() %></td>
	</tr>
	<tr>
		<td><jsp:getProperty property="bookId" name="book"/> </td>
		<td><jsp:getProperty property="bookName" name="book"/></td>
		<td><jsp:getProperty property="authorName" name="book"/></td>
		<td><jsp:getProperty property="price" name="book"/></td>
		<td><jsp:getProperty property="noOfPages" name="book"/></td>
	</tr>
</table>
</body>
</html>