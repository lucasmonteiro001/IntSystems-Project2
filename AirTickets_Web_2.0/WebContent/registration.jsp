<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/checkPwd.js"></script>
<link rel="stylesheet" type="text/css" href="style/bootstrap.css">
<title>Registration Page</title>
</head>
<body>
<div class="container-fluid">
	<h3>Register here</h3>
	<form class="form-horizontal" role="form" name="registration" action="Registration" method="post" style="display:block" onsubmit="return validate()">
		<div class="form-group">
			<label class="col-sm-2 control-label" for="username">User</label>
			<div class="col-sm-10">
				<input type="text" class="form-group" id="username" placeholder="Username" name="username">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="password">Password</label>
			<div class="col-sm-10">
				<input type="password" class="form-group" id="password" placeholder="Password" name="password">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label" for="password2">Password</label>
			<div class="col-sm-10">
				<input type="password" class="form-group" id="password2" placeholder="Retype your password" name="password2" onkeyup="checkPass(); return false;">
			</div>
			<span id="confirmMessage" class="confirmMessage"></span> 
		</div>
		<input type="button" class="col-sm-offset-1 btn btn-danger" value="Cancel" onclick="window.location='login.jsp';" >
		<input class="btn btn-success" type="submit" value="Submit">
	</form>
</div>
</body>
</html>