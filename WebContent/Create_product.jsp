<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Create New Product</title>
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
		<form action="CreateProduct" method="get">
			<h2>Create New Production</h2>
        	<table border="1" cellpadding="5">
        		<tr>
           			<th>Name Product: </th>
           			<td><input type="text" name="name_product"></td>
				</tr>
				<tr>
           			<th>Producer: </th>
           			<td>
           				<select name="id_producer">
           					<option value="1" label="Cannon"></option>
           					<option value="2" label="LG"></option>
           					<option value="3" label="Samsung"></option>
           					<option value="4" label="Iphone"></option>
           					<option value="5" label="Sony"></option>
           					<option value="6" label="Xiaomi"></option>
           					<option value="7" label="Vivo"></option>
           					<option value="8" label="Apple"></option>           					
           				</select>
           			</td>
           		</tr>
           		<tr>
           			<th>Producion: </th>
           			<td>
           				<select name="id_production">
           					<option value="1" label="Sound devices"></option>
           					<option value="2" label="Video Game Consoles"></option>
           					<option value="3" label="Sell/Mobile/Wireless Phones"></option>
           					<option value="4" label="Home security system"></option>
           					<option value="5" label="Cameras"></option>
           					<option value="6" label="Home theater system"></option>
           					<option value="7" label="TVs"></option>
           					<option value="8" label="Computers"></option>  
           					<option value="9" label="Games/Movies/Music"></option>
           					<option value="10" label="Accessories"></option>
           					<option value="11" label="Office"></option>
           					<option value="12" label="Home applicances"></option>         					
           				</select>
           			</td>
           		</tr>
           		<tr>
          			<th>Type: </th>
           			<td>
           				<select name="type">
           					<option value="Specials" label="Specials"></option>
           					<option value="Latest" label="Latest"></option>
           					<option value="Featured" label="Featured"></option>
           				</select>
           			</td>
				</tr>
           		<tr>
           			<th>Price: </th>
        			<td><input type="text" name="price"></td>
           		</tr>
           		<tr>
           			<th>Price Sale: </th>
           			<td><input type="text" name="price_sale"></td>
           		</tr>
           		<tr>
           			<th>Image: </th>
           			<td><input type="text" name="image"></td>
           		</tr>
           		<tr>
           			<th>Describe:</th>
           			<td><input type="text" name="describe"></td>
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