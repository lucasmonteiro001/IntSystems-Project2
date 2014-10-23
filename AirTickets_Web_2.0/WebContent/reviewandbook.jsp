<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style/bootstrap.css">
<title>Review your order</title>
</head>
<body>
	<h3>You have choosen this flight</h3>
	<ul>
		<li>09/30/14 - Belo Horizonte - Lincoln - 844 - 6:00pm - Lincoln
			- Belo Horizonte - 845 - 6:00am</li>
	</ul>
	<input type="button" class="btn btn-danger" value="Back to see the flights"
		onclick="window.location='flightsearch.jsp';">
	<input type="submit" class="btn btn-success" name="send" value="Confirm" align="right"
		onclick="window.location='transaction.jsp';">
		
	<br><br><button type="button" class="btn btn-default"  onClick="window.location='login.jsp'"><b>Logout</b></button>
</body>
</html>