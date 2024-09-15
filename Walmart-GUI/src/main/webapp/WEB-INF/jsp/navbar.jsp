<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Home</title>
</head>

<body>
	<nav class="navbar navbar-expand-lg navbar navbar-dark bg-primary">
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarTogglerDemo03"
			aria-controls="navbarTogglerDemo03" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<a class="navbar-brand" href="/">Walmart</a>

		<div class="collapse navbar-collapse" id="navbarTogglerDemo03">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item active"><a class="nav-link" href="/home">Home
						<span class="sr-only">(current)</span>
				</a></li>
				
				<li class="nav-item active"><a class="nav-link" href="/electronic">Electronic
						<span class="sr-only">(current)</span>
				</a></li>
				
				<li class="nav-item active"><a class="nav-link" href="/women">Women Cloths
						<span class="sr-only">(current)</span>
				</a></li>
				
				<li class="nav-item active"><a class="nav-link" href="/men">Men Cloths
						<span class="sr-only">(current)</span>
				</a></li>
				
				<li class="nav-item active"><a class="nav-link" href="/jewelery">Jewelery
						<span class="sr-only">(current)</span>
				</a></li>
			
				<li class="nav-item"><a class="nav-link disabled" href="#">Disabled</a>
				</li>
			</ul>


			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>

		<%
		String isLogin = (String) session.getAttribute("isLogin");
		String userName= (String) session.getAttribute("currentUserName");
		%>

		<div>

			<c:choose>
				<c:when test="${isLogin == 'YES'}">
					<button type="button" class="btn btn-danger ml-5">
						<li class="nav-item"><a style="color: white;"
							class="nav-link" href="/logout">Logout</a></li>
					</button>
					<p> <%=userName %>
				</c:when>
				<c:otherwise>
					
					
					<button type="button" class="btn btn-success ml-5">
						<li class="nav-item"><a style="color: white;"
							class="nav-link" href="/login">Login</a>
						</li>
					</button>
					<p> Please login</p>
				</c:otherwise>
			</c:choose>

		</div>
	</nav>

</body>
</html>
