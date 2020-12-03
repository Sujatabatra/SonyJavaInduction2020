<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Arithmetic Operators</b> <br>
10 + 2 : ${10+2 }<br><br>
10 - 2 : ${10-2 }<br><br>
10 * 2 : ${10*2 }<br><br>
10 / 2 : ${10/2 }<br><br>
10 % 2 : ${10%2 }<br><br>
10 / 0 : ${10/0 }<br><br>


<b>Relational Operators</b><br>
11 &lt; 2 : ${11<2}<br><br>
11 &gt; 2 : ${11>2}<br><br>
11 &lt;= 2 : ${11<=2}<br><br>
11 &gt;= 2 : ${11>=2}<br><br>
11 != 2 : ${11!=2}<br><br>
11 = 2 : ${11==2}<br><br>

<b>Relation and Logical Operator</b><br>
(11 &lt; 2) and (7 &gt; 2) : ${(11<2) && (7>2)}<br><br>
(11 &lt; 2) or (7 &gt; 2) : ${(11<2) || (7>2)}<br><br>
</body>
</html>