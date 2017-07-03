
   
<%-- <%taglib prefix="c" uri="/jstl/core" %>  
solve the down two lines error whenu see this file
<%@page import="java.util.Date"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String msg= "Core tags"; %>
<br>
Print using c:out tag:<c:out value="${msg }"/>
<br>
<%-- Setting time using c:out tag <c:set var="now" value="<%=new Date() %>"/> --%>
<br>
Time now: <c:out value="$(now)"/>

<br>
Printing 1 to 5 using for loop:<br>
<c:forTokens items="1,2,3,4,5" delims="," var="no">
	<c:out value="${no}"></c:out>
</c:forTokens>
</body>
</html>