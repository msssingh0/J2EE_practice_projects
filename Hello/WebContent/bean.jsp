<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="e" class="com.Employee"></jsp:useBean>
	<jsp:setProperty property="*" name="e"/>
	
	<h2>Employee's Details</h2>
	<h2>Id: <jsp:getProperty property="id" name="e"/></h2>
	<h2>Name:<jsp:getProperty property="name" name="e"/></h2>
	<h2>Salary <jsp:getProperty property="salary" name="e"/></h2>
</body>
</html>