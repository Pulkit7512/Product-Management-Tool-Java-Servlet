
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import = "com.nagarro.assignment.model.Product"%>
<%@ page import = "java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<%
		if(session.getAttribute("uname") == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	<header class = "container">
	<h3>Hello, ${uname}</h3>
	<a href = "logout"><button class = "btn btn-secondary">Logout</button></a>
	</header>
	<br>
	<div class ="container w-25 p-3 border border-primary rounded-3 bg-light">
	<h5>Add new Product</h5>
	<form class = "form	" action="add" method = "post">
		<label class="form-label" for = "Title">Title</label>
		<input class="form-control" type = "text" id = "title" name = "title" required>
		<label class="form-label" for = "quantity">Quantity</label>
		<input class="form-control" type = "number" id = "quantity" name = "quantity" required>
		<label class="form-label" for = "size">Size</label>
		<input class="form-control" type = "number" id = "size" name = "size" required>
		<label class="form-label" for = "image">Image</label>
		<input class="form-control" type = "text" id = "image" name = "image" required>
		<button class = "btn btn-primary" type = "submit">Submit</button>
	</form>
	</div>
	<br>
	<div class ="container">
	<table class = "table table-success table-striped">
	<thead>
		<tr>
			<th>Title</th>
			<th>Quantity</th>
			<th>Size</th>
			<th>Image</th>
			<th colspan = '2'>Action</th>
		</tr>
		</thead>
	<tbody>
	  <c:forEach items="${products}" var="product">
	    <tr>
	      <td><c:out value="${product.title}"/></td>
	      <td><c:out value="${product.quantity}" /></td>
	      <td><c:out value="${product.size}" /></td>
	      <td><c:out value="${product.image}" /></td>
	      <td><form action = "edit">
	      		<input type = "hidden" name = "title" value = "${product.title}">
	      		<input type = "hidden" name = "quantity" value = "${product.quantity}">
	      		<input type = "hidden" name = "size" value = "${product.size}">
	      		<input type = "hidden" name = "image" value = "${product.image}">
	      		<button class = "btn btn-warning" type = "submit">edit</button></form></td>
	      <td><form action = "deleted">
	      		<input type = "hidden" name = "title" value = "${product.title}">
	      		<button class = "btn btn-danger" type = "submit">delete</button></form></td>
	    </tr>
	  </c:forEach>
	</tbody>
	</table>
	</div>
</body>
</html>