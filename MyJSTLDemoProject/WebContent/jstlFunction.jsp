<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="oldPassword" value="Hello"></c:set>
	<c:set var="newPassword" value="HelloNew"></c:set>
	<c:set var="message" value="New Password should not contain old password as substring"></c:set>
	<c:if test="${fn:contains(newPassword,oldPassword) }">
		<c:out
			value="${fn:toUpperCase(message) }"></c:out>
	</c:if>
</body>
</html>