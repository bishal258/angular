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
 <h2> Add Form</h2>
 	<form:form action="addStudent" modelAttribute="student" method="POST">
 		<label>Id</label>
 		<form:input type="text" path = "id"/>
 		
 		<label>First Name</label>
 		<form:input type="text" path = "firstName"/>
 		
 		<label>Last Name</label>
 		<form:input type="text" path = "lastName"/>
 		
 		<input type="submit" value="Save" />
 		
 	</form:form> 
</body>
</html>