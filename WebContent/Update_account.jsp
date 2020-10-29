<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Update Account</title>
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
		    width:40%;
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
		<form action="UpdateAccount" method="post">
			<h2>Update Account</h2>
        	<table border="1" cellpadding="5">
        		<input type="hidden" name="id" value="<c:out value="${ACCOUNT.id_customer}"/>"/>	
        		<tr>
           			<th>Name Customer: </th>
           			<td><input type="text" name="name_customer" value="<c:out value="${ACCOUNT.name_customer}"/>"/></td>
				</tr>
				<tr>
           			<th>Email: </th>
        			<td><input type="text" name="email" value="<c:out value="${ACCOUNT.email}"/>"></td>
           		</tr>
           		<tr>
           			<th>Phone Number: </th>
           			<td><input type="text" name="phone_number" value="<c:out value="${ACCOUNT.phone_number}"/>"></td>
           		</tr>
           		<tr>
           			<th>Discount: </th>
           			<td><input type="text" name="discount" value="<c:out value="${ACCOUNT.discount}"/>"></td>
           		</tr>
           		<input type="hidden" name="username" value="<c:out value="${ACCOUNT.username}"/>"/>
           		<tr>
           			<th>Password: </th>
           			<td><input type="text" name="password" value="<c:out value="${ACCOUNT.password}"/>"></td>
       	    	</tr>
       	     	<tr>
    	            <td></td>
    	            <td><input type="submit" value="Save" /> </td>
				</tr>
    	    </table>
		</form>
	</div>
        
</body>
</html>