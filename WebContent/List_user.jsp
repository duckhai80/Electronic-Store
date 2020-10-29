<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>List User</title>
	<style type="text/css">
		body {
	    	background: url(/Images/1.jpg)no-repeat center top;
	    	background-size: cover;
	    	-webkit-background-size: cover;
	    	-moz-background-size: cover;
	    	-o-background-size: cover;
	    	-ms-background-size: cover;
	    	background-attachment: fixed;
	    	background-position: center;
	    	text-align: center;
			font-family: 'Open Sans', sans-serif;
		}
		table{
		    width:80%;
		}
		table,th,td{
		    border:1px solid gray;
		    border-collapse: collapse;
		}
		th,td{
		    padding:7px 15px;
		}
		th{
		    background-color: #008040;
		    color: white;
		}	
		tr:nth-child(even){
		    background-color: #F0F0F0;
		}
		tr:hover{
	    	background-color: #ddd;
		}
	</style>
</head>
<body>
	<div align="center">
  		<a href="${pageContext.request.contextPath}/HomeUserServlet">View Store</a>
    	<a href="${pageContext.request.contextPath}/ListProduct">List Product</a>
    	<a href="${pageContext.request.contextPath}/HomeServlet">Logout</a>
	</div>
	
	<div align="center">
		<h2>List Of Accounts</h2>
		<table border="1" cellpadding="10">
			<tr>
				<th>ID</th>
				<th>Name Customer</th>
				<th>Email</th>
				<th>Phone Number</th>
				<th>Discount</th>
				<th>Username</th>
				<th>Password</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="tempAccount" items="${LIST_ACCOUNT}">
				<tr>
					<td><c:out value="${tempAccount.id_customer}"></c:out></td>
					<td><c:out value="${tempAccount.name_customer}"></c:out></td>
					<td><c:out value="${tempAccount.email}"></c:out></td>
					<td><c:out value="${tempAccount.phone_number}"></c:out></td>
					<td><c:out value="${tempAccount.discount}"></c:out></td>
					<td><c:out value="${tempAccount.username}"></c:out></td>
					<td><c:out value="${tempAccount.password}"></c:out></td>
					<td>
						<a href="${pageContext.request.contextPath}/UpdateAccountForm?username=<c:out value="${tempAccount.username}" />">Update</a>
						<a href="${pageContext.request.contextPath}/DeleteAccount?username=<c:out value="${tempAccount.username}" />">Delete</a>
					</td>
				</tr>
			</c:forEach>		
		</table>
	</div>
</body>
</html>