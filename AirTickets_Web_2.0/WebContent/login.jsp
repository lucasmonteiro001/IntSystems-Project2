<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style/bootstrap.css">
<title>Login page</title>
</head>
<body>
	<div class="container-fluid">
		<h3>Log in here</h3>
		<form class="form-horizontal" role="form" name="input" action="Login" method="post">
			<div class="form-group">
				<label class="col-sm-2 control-label" for="email">email</label>
				<div class="col-sm-10">
					<input type="textfield" class="form-group" id="email" placeholder="email" name="email">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label" for="password">Password</label>
				<div class="col-sm-10">
					<input type="password" class="form-group" id="password" placeholder="Password" name="password">
				</div>
			</div>
			<input class="col-sm-offset-2 btn btn-success" type="submit" value="Submit">
		</form>
		<p align="left"> Don't have an account yet? Click <a href = "registration.jsp"> here </a> to register </p>
	</div>
</body>
</html>