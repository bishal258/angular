<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Info</title>
</head>
<body>
	<form:form action = "updateStudent" modelAttribute="student">
	<label>ID:</label>
	<form:input type="text" value="${student.id }" path="id"/>
	
	<br>
	<label>First Name:</label>
	<form:input type="text" value="${student.firstName }" path="firstName"/>
	<br>
	<label>Second Name:</label>
	 <form:input type="text" value="${student.lastName }" path="lastName"/>
	 
	<input type ="submit" value="Submit"/>
	
	</form:form>
	
</body>
</html>