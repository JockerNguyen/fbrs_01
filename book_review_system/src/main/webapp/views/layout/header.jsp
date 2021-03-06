<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!--parameter url  -->
<spring:url value="/" var="urlHome" />
<spring:url value="/home.jsp" var="homeUrl" />
<spring:url value="/book" var="bookUrl" />
<spring:url value="/assets/img/bookstor_compact.png" var="icon" />
<!--Bootstrap  -->
<spring:url value="/assets/css/font-awesome.min.css" var="frontAwesome" />
<spring:url value="/assets/mycss/style.css" var="style" />
<spring:url value="/assets/mycss/style1.css" var="style1" />
<spring:url value="/assets/css/bootstrap.min.css" var="bootstrapCss" />
<link rel="stylesheet" href="${bootstrapCss}" />
<link rel="stylesheet" href="${frontAwesome}" />
<link rel="stylesheet" href="${style}" />
<link rel="stylesheet" href="${style1}" />
 <header class="header-pos sticky-top">
			<!-- header-bottom-area start -->
			<div class="header-bottom-area">
				<div class="container">
					<div class="inner-container">
						<div class="row">
							<div class="col-md-2 col-sm-4 col-xs-5">
								<div class="logo">
									<a href="index.html"><img src="${icon }"   /></a>
								</div>
							</div>
							<div class="col-md-8 hidden-xs hidden-sm">
								<div class="main-menu">
									<nav>
										<ul>
											<li><a href="http://bit.do/bromq">home</a></li>
											<li><a href="${bookUrl }">Book</a></li>						
																					
											<li><a href="contact.html">contact</a></li>
										</ul>
									</nav>
								</div>
							</div>
							<div class="col-md-2 col-sm-8 col-xs-7 header-right">
								<div class="user-meta">
									<a href="#"><i class="fa fa-cog"></i></a>
									<ul>
										<li><a href="#">My Account</a></li>
										<li><a href="#">Wish list</a></li>
										<li><a href="#">Checkout</a></li>
										<li><a href="#">Testimonial</a></li>
										<li><a href="#">Log in</a></li>
									</ul>								
								</div>
								<div class="header-search">
									<i class="fa fa-search"></i>
									<div class="header-form">
										<form action="#">
											<input type="text" placeholder="search" />
											<button><i class="fa fa-search"></i></button>
										</form>
									</div>
								</div>							
							</div>
						</div>
					</div>
				</div>
			</div>
   </header>