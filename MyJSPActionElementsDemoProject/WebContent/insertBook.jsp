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
<%
	//int id=Integer.parseInt(request.getParameter("bookId"));
	//String name=request.getParameter("bookName");
	//String author=request.getParameter("authorName");
	//int price=Integer.parseInt(request.getParameter("price"));
	//int noOfPages=Integer.parseInt(request.getParameter("noOfPages"));
	//Book book=new Book(id,name,author,price,noOfPages);
	
	//session.setAttribute("book", book);
	
	//response.sendRedirect("./bookInsert");

%>

<jsp:useBean id="book" class="com.sujata.model.bean.Book" scope="session"></jsp:useBean>

<jsp:setProperty property="*" name="book"/>

<%-- 
<jsp:setProperty property="bookId" name="book" param="bookId"/>
<jsp:setProperty property="bookName" name="book" param="bookName"/>
<jsp:setProperty property="authorName" name="book" param="authorName"/>
<jsp:setProperty property="price" name="book" param="price"/>
<jsp:setProperty property="noOfPages" name="book" param="noOfPages"/>
--%>
<jsp:forward page="./bookInsert"></jsp:forward>

</body>
</html>