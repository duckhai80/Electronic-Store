<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>List Product</title>
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
		    width:90%;
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
    	<a href="${pageContext.request.contextPath}/ListUser">User Information</a>
    	<a href="${pageContext.request.contextPath}/HomeServlet">Logout</a>
	</div>
	<div align="center">
		<h2><a href="${pageContext.request.contextPath}/Create_product.jsp">Add New Product</a></h2>
	</div>
	<div align ="center">
	<table border="1" cellpadding="10">
		<caption><h2>List of Products</h2></caption>
		<tr>
			<th>ID</th>
			<th>Name Product</th>
			<th>Price Sale</th>
			<th>Price</th>
			<th>Image</th>
			<th>Describe</th>
			<th>Actions</th>
		</tr>
		<c:forEach items ="${LIST_PRODUCT}" var ="tempProduct">
		<tr>
			<td><c:out value="${tempProduct.id}"></c:out></td>
			<td><c:out value ="${tempProduct.name_product }"></c:out></td>
			<td><c:out value ="${tempProduct.price_sale }"></c:out></td>
			<td><c:out value ="${tempProduct.price }"></c:out></td>
			<td><img src='<c:url value="${tempProduct.image}"></c:url>' height="100" width="100"></td>
			<td><c:out value ="${tempProduct.describe }"></c:out></td>
			<td>
				<a href="${pageContext.request.contextPath}/UpdateProductForm?id=<c:out value ="${tempProduct.id}"/>">Update</a>
				<a href="${pageContext.request.contextPath}/DeleteProduct?id=<c:out value ="${tempProduct.id}"/>">Delete</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>