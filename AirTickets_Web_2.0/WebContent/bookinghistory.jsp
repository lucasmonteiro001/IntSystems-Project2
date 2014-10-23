<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style/bootstrap.css">
<style>
table, th, td {
    border: 1px solid black;
    padding: 10px;
}
thead {
	font-weight: bold;
}
</style>
<title>Booking History</title>
</head>
<body>
	<div class="container-fluid">
		<h3 style="display:inline">Your booking history is below:</h3><br><br>
		<table style="border:1px solid black">
			<thead>
				<td> Date </td>
				<td> From </td>
				<td> To </td>
				<td> Flight Number </td>
				<td> Departure Time </td>
				<td> Arrival Time </td>
				<td> Number of Stops </td>
				<td> Cost </td>
			</thead>
			<tr>
				<td> 09/30/14 </td>
				<td> Belo Horizonte </td>
				<td> Lincoln </td>
				<td> 844 </td>
				<td> 1:00pm </td>
				<td> 6:00am </td>
				<td> 2 </td>
				<td> $389,00 </td>
			</tr>
		</table>
	</div>
	<br><br>
	<button type="button" class="btn btn-primary"  onClick="window.location='flightsearchquery.jsp'"><b>Home</b></button>
	<button type="button" class="btn btn-default"  onClick="window.location='login.jsp'"><b>Logout</b></button>
</body>
</html>