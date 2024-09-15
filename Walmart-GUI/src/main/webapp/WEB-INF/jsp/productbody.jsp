<%@page import="java.util.ArrayList"%>
<%@page import="com.gui.model.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

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

<title>productbody</title>

<style type="text/css">
#b1{ 
	margin: 3%;
}

.col{
	margin: 5px; 
	padding: 5px;
}
.body{
display: inline-block;
}

</style>

</head>


<body>

<%
List<Product> allProducts = (List<Product>) session.getAttribute("productData"); //object

%> 
	<div id="b1">
	
		<div class="row">
		
		  <c:forEach items="<%=allProducts %>" var="obj"> 
		  
			<div class="col">
				<div class="card" style="width: 18rem;">
					<img class="card-img-top" src=" ${obj.productImageUrl} ">
					<div class="card-body">
						<h5 class="card-title">${obj.title}   </h5>
						<p class="card-text">${obj.description}</p>
						<a href="#" class="btn btn-primary">${obj.price}</a>
						<a href="#" class="btn btn-primary">Add cart</a>
					</div>
				</div>
			</div>
		
 </c:forEach>
			
			</div>

	</div>
</body>


</html>