<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Enter Student Id to update</h2>
	
			
	<form:form  action = "showStudent" modelAttribute = "student" method="POST">
			<form:input type = "text" min="1" path = "firstName"/>
			<input type ="submit" value="Submit"/>
	</form:form> 
	
	
	
</body>
</html>