<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bookInfo" class="com.sujata.bean.BookInfoBean"></jsp:useBean>
<%!
	String user_levels[]={"Beginner","Intermediate","Advance"};
	String name="Learn Java in 21 Days";
	
%>
<%-- 
<jsp:setProperty property="title" name="bookInfo" value="<%=name%>"/>
--%>
<jsp:setProperty property="title" name="bookInfo" value="${name}"/>
<jsp:setProperty property="userLevels" name="bookInfo" value="<%=user_levels%>"/>

Book Name : <jsp:getProperty property="title" name="bookInfo"/><br><br>
<%--get property is failing in displaying array --%>
User Levels: <jsp:getProperty property="userLevels" name="bookInfo"/><br><br>

<%
String userLevels[]=bookInfo.getUserLevels();
for(int i=0;i<userLevels.length;i++){
	out.println(userLevels[i]);
}
%>


<jsp:useBean id="author" class="com.sujata.bean.Author"></jsp:useBean>
<jsp:setProperty property="authorId" name="author" value="111"/>
<jsp:setProperty property="authorName" name="author" value="Author A"/>
<br><br>
Author ID : <jsp:getProperty property="authorId" name="author"/><br><br>
Author Name :<jsp:getProperty property="authorName" name="author"/>

<jsp:setProperty property="author" name="bookInfo" value="<%=author %>"/>
<%--getProperty I am unable to access inner bean --%>
Book Author : <jsp:getProperty property="author" name="bookInfo"/><br><br>
BookAuthor : <%=bookInfo.getAuthor().getAuthorName()+" having ID "+bookInfo.getAuthor().getAuthorId()  %>
</body>
</html>