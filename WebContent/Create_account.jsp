<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Create Account</title>
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
		<h1>Create Account Form</h1>
	</div>
	<!--//header-->
	<div class="main-content-agile">
		<div class="sub-main-w3">	
			<div class="wthree-pro">
				<h2>Create Quick</h2>
			</div>
			<form action="CreateAccount" method="get">
				<div class="pom-agile">
					<input placeholder="Username" name="username" class="user" type="text" required="">
					<span class="icon1"><i class="fa fa-user" aria-hidden="true"></i></span>
				</div>
				<div class="pom-agile">
					<input  placeholder="Full Name" name="name_customer" class="user" type="text" required="">
					<span class="icon1"><i class="fa fa-user" aria-hidden="true"></i></span>
				</div>
				<div class="pom-agile">
					<input  placeholder="Password" name="password" class="pass" type="password" required="">
					<span class="icon2"><i class="fa fa-unlock" aria-hidden="true"></i></span>
				</div>
				<div class="pom-agile">
					<input  placeholder="Phone" name="phone_number" class="user" type="text" required="">
					<span class="icon1"><i class="fa fa-user" aria-hidden="true"></i></span>
				</div>
				<div class="pom-agile">
					<input  placeholder="Email" name="email" class="user" type="text" required="">
					<span class="icon1"><i class="fa fa-user" aria-hidden="true"></i></span>
				</div>
				<div class="sub-w3l">
					<h6><a href="${pageContext.request.contextPath}/HomeServlet">Cancel</a></h6>
					<div class="right-w3l">
						<input type="submit" value="Save">
					</div>
				</div>
			</form>
		</div>
	</div>
	<!--//main-->
	<!--footer-->
	<div class="footer">
		<p>&copy; 2017 Online Login Form. All rights reserved | Design by <a href="http://w3layouts.com">Khai</a></p>
	</div>
	<!--//footer-->
</div>
</body>
</html>