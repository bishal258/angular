<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student</title>
</head>
<body>
	<h2>Student Info</h2>
	
	<table>
	 <tr>
	 <th>ID</th>
	 <th>First Name</th>
	 <th>Last Name</th>
	 <th>Action>
	 </tr>
		<c:forEach var="tempCustomer" items="${student}">
		<tr>	
		<td>${tempCustomer.id }</td>
		<td>${tempCustomer.firstName }</td>
		<td>${tempCustomer.lastName }</td>
		<td> <a href="${deleteLink }">Delete</a></td>
		</tr>
		
		<c:url var="deleteLink" value="/customer/delete">
 			<!-- we will get by the id http://localhost:8081/web-customer-tracker/customer/customer/showFormForUpdate?customerID=1 -->
 				<c:param name ="customerID" value ="${tempCustomer.firstName }" />
 	</c:url>
		</c:forEach>
	</table>
</body>
</html>