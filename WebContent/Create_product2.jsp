<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Online Login Form Responsive Widget Template :: w3layouts</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Online Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Meta tag Keywords -->
<!-- css files -->
<link rel="stylesheet" href="Cs/style1.css" type="text/css" media="all" /> <!-- Style-CSS --> 
<link rel="stylesheet" href="Cs/font-awesome.css"> <!-- Font-Awesome-Icons-CSS -->
<!-- //css files -->
<!-- online-fonts -->
<link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i&amp;subset=cyrillic,cyrillic-ext,greek,greek-ext,latin-ext,vietnamese" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext" rel="stylesheet">
<!-- //online-fonts -->
</head>
<body>
<!-- main -->
<div class="center-container">
	<!--header-->
	<div class="header-w3l">
		<h1>Create Product Form</h1>
	</div>
	<!--//header-->
	<div class="main-content-agile">
		<div class="sub-main-w3">	
			<div class="wthree-pro">
				<h2>Create Quick</h2>
			</div>
		</div>
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
	</div>
	<div class="footer">
		<p>&copy; 2017 Online Login Form. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
	</div>
</div>		
</body>
</html>