
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "com.nagarro.assignment.model.Product"%>
<%@ page import = "java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<%
		if(session.getAttribute("uname") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<div class ="container mt-4 ms-6 p-4 w-25 border border-primary rounded-3 bg-light">
	<h5>Edit Product</h5>
	<form  class="form" action="add" method = "post">
		<label class="form-label" for = "Title">Title</label>
		<input class="form-control" type = "text" name = "title" value = "${title}" required readonly>
		<label class="form-label" for = "quantity">Quantity</label>
		<input class="form-control" type = "number" name = "quantity" value = "${quantity}" required>
		<label class="form-label" for = "size">Size</label>
		<input class="form-control" type = "number" name = "size" value = "${size}" required>
		<label class="form-label" for = "image">Image</label>
		<input class="form-control" type = "text" name = "image" value = "${image}" required>
		<button class = "btn btn-primary" type = "submit">Submit</button>
	</form>
	</div>
</body>
</html>