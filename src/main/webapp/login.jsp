<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body >
<div class = "container w-25 p-3 border border-primary rounded-3 bg-light">
	<h3>Login</h3>
	<form class = "form" action="products" method = "post">
		<label class="form-label" for = "username">Username</label>
		<input class="form-control" type = "text" id = "username" name = "username" required>
		<br>
		<label class="form-label" for = "password">Password </label>
		<input class="form-control" type = "password" id = "password" name = "password" required>
		<br>
		<button class = "btn btn-primary" type = "submit">Login</button>
	</form>
</div>
</body>
</html>