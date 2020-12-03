<%@page import="com.sujata.bean.BookInfoBean"%>
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
//BookInfoBean b=(BookInfoBean)session.getAttribute("book");

//BookInfoBean b1=(BookInfoBean)application.getAttribute("book");
%>

Book Name at session Scope : ${sessionScope.book.title}<br><br>
Book Name at application Scope : ${applicationScope.book.title}<br><br>

<!-- when we are not specifying any scope : page, request,session,application -->
Book Name : ${book.title }

</body>
</html>