<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
	<meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

    <link href="Cs/Style.css" rel="stylesheet" />
    <script src="Js/jquery-3.2.1.min.js"></script>

    <style>
        @import url('https://fonts.googleapis.com/css?family=Josefin+Sans|Lobster+Two|Pacifico');
    </style>
</head>
<body>
    <section>
        <!-- This is Section 1 of the page -->
        <div class="section1">
            <img src="Images/Website_Logo.png" class="logo" />
            <div class="navigation">
                <img src="Images/if_List_Text_Menu_Numbers_String_Burger_1329080.png" class="toggle" />
                <a class="cgr" >Categories</a>
            </div>
            <div>
                <a href="SoundDevices" class="submenu">Sound devices</a>
                <a href="VideoGameConsoles" class="submenu">Video game consoles</a>
                <a href="CellMobileWirelessPhones" class="submenu">Cell/Mobile/Wireless phones</a>
                <a href="HomeSecuritySystem" class="submenu">Home security system</a>
                <a href="Cameras" class="submenu">Cameras</a>
                <a href="HomeTheaterSystem" class="submenu">Home theater system</a>
                <a href="TVs" class="submenu">TVs</a>
                <a href="Computers" class="submenu">Computers</a>
                <a href="GamesMoviesMusic" class="submenu">Games/Movies/Music</a>
                <a href="Accessories" class="submenu">Accessories</a>
                <a href="Office" class="submenu">Office</a>
                <a href="HomeAppliances" class="submenu">Home appliances</a>
            </div>

            <p class="para1">Specials</p>
            <div class="Special">
				<c:forEach var="tempProduct_specials" items="${LIST_PRODUCT_SPECIALS}">
					<fieldset>
						<legend>Sale</legend>
						<div class="div1">
							<img src='<c:url value="${tempProduct_specials.image}"></c:url>' height="100" width="100">						
						</div>
						<div class="div2">
							<h3>$<c:out value="${tempProduct_specials.price_sale}"></c:out><strike><c:out value="${tempProduct_specials.price}"></c:out></strike></h3>
							<p><c:out value="${tempProduct_specials.name_product}"></c:out> </p>
							<br><br>
							<button type="button" class="btnbuy">Buy</button>
						</div>
					</fieldset>
				</c:forEach>   
			</div>
        </div>



        <!-- This is section 2 of the page -->
        <div class="section2">
            <input type="text" placeholder="search" class="txtsrch" />
            <button type="button" class="btnsrch">Search</button>
            <img src="Images/if_call_322424.png" class="call-icon" />
            <span class="tel-no">800-8600-9662</span>
			
			<div align="right">
    			<h4>
    				<a href="${pageContext.request.contextPath}/Login.jsp">Login</a> &nbsp; | &nbsp;
    				<a href="${pageContext.request.contextPath}/Create_account.jsp">Create Account</a>
    			</h4>
			</div>

            <nav>
                <a class="menuitem" >Home</a>
                <a class="menuitem">Wish list(0)</a>
                <a class="menuitem">My Account</a>
                <a class="menuitem">Shopping Cart</a>
                <a class="menuitem">Checkout</a>
                <a class="menuitem">items(s)</a>
            </nav>

            <div class="slider">
                <div class="slides">
                    <div class="slide1">
                        <img src="Images/4-2-iphone-png-picture-png-image.png" class="img1" />
                    </div>
                    <div class="slide1">
                        <img src="Images/2-2-iphone-png-picture.png" class="img2" />
                    </div>
                    <div class="slide1">
                        <img src="Images/1-2-iphone-png-picture-png-clipart.png" class="img3" />
                    </div>
                    <div class="constant">
                        <h1>iPhone 7</h1>
                        <p>Comfort is a very important things nowadays because it is a condition of satifaction.</p>
                        <a class="btnshopnow">Shop Now!</a>
                    </div>
                </div>
            </div>


            <div class="content1">
                <div class="innertitle1">
                    <h3>Home Theater & TV</h3>
                    <p class="para1">Comfort is a very important things nowadays because it is a condition of satifaction.</p>
                    <br />
                    <p class="para1">Shop Now!</p>
                </div>

                <div class="innertitle2">
                    <h3>Home Appliances</h3>
                    <p class="para1">Comfort is a very important things nowadays because it is a condition of satifaction.</p>
                    <br />
                    <p class="para1">Shop Now!</p>
                </div>

                <div class="inner1">
                    <img src="Images/Home_Theaters.png" class="img1" />
                </div>
                <div class="inner2">
                    <img src="Images/Black_Vacuum_Cleaner_PNG_Clipart-629.png" class="img2" />
                </div>
            </div>

            <p class="featuredpara">Latest</p>

            <div class="products">
               <c:forEach var="tempProduct_latest" items="${LIST_PRODUCT_LATEST}">
					<fieldset class="col1">
						<legend>Hot</legend>
						<img src='<c:url value="${tempProduct_latest.image}"></c:url>' class="img1">						
						<h3>$<c:out value="${tempProduct_latest.price_sale}"></c:out><strike><c:out value="${tempProduct_latest.price}"></c:out></strike></h3>
						<h4><c:out value="${tempProduct_latest.name_product}"></c:out></h4>
						<p><c:out value="${tempProduct_latest.describe}"></c:out></p>
						<button type="button" class="btnbuy">Buy</button>
					</fieldset>
				</c:forEach>               
            </div>


            <p class="featuredpara">Featured</p>

            <div class="products">
               <c:forEach var="tempProduct_featured" items="${LIST_PRODUCT_FEATURED}">
					<fieldset class="col1">
						<legend>New</legend>
						<img src='<c:url value="${tempProduct_featured.image}"></c:url>' class="img1">						
						<h3>$<c:out  value="${tempProduct_featured.price_sale}"></c:out><strike><c:out value="${tempProduct_featured.price}"></c:out></strike></h3>
						<h4><c:out value="${tempProduct_featured.name_product}"></c:out></h4>
						<p><c:out value="${tempProduct_featured.describe}"></c:out></p>
						<button type="button" class="btnbuy">Buy</button>
					</fieldset>
				</c:forEach>               
            </div>


        </div>
    </section>

    <div class="background"></div>

    <div class="footer">

        <div class="outer">
            <div class="inner">
                <h4>Information</h4>
                <a href="About">About</a>
                <a href="DeliveryInformation">Delivery Information</a>
                <a href="PrivacyPolicy">Privacy Policy</a>
                <a href="Team&Condition">Tearm & Condition</a>
            </div>
            <div class="inner2">
                <h4>Costomer Information</h4>
                <a href="ContactUs">Contact Us</a>
                <a href="Return">Return</a>
                <a href="SiteMap">Site Map</a>
            </div>
            <div class="inner">
                <h4>My Account</h4>
                <a href="OrderHistory">Order History</a>
                <a href="WishList">Wish List</a>
                <a href="NewsLatter">News Latter</a>
            </div>
            <div class="inner2">
                <h4>Follow Us</h4>
                <a href="https://www.facebook.com/duckhai80">Facebook</a>
                <a href="Twitter">Twitter</a>
                <a href="Google+">Google +</a>
                <a href="Youtube">Youtube</a>
            </div>
        </div>

        <hr />
        <div class="copyright">
            <span>Powered by Khai Truong © 2019</span>
        </div>

    </div>

    <script>

        var $slides = $('.slides');
        var $slide = $('.slide1');
        var count = 1;

        $(document).ready(function () {

            setInterval(function () {

                $slides.animate({ 'margin-left': '-=68vw' }, 1200, function () {

                    count++;
                    if (count === 4) {
                        $slides.css("margin-left", 0);
                        count = 1;
                    }

                });
            }, 4000);
        });

    </script>
</body>
</html>
