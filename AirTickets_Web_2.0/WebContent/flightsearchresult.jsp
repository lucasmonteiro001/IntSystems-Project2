<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<title>Flight Search</title>
</head>
<body>
	<div class="container-fluid">
		<h3 style="display:inline">Choose your flight</h3>
		<img style="display:inline;" align="right" src="style/background-mg.png" alt="Minas" height="80" width="80">
		<br><br><p style="disply:block">Choose your destiny and when you want to go.</p>
		<form name="input" action="reviewandbook.jsp" method="post" role="form">
			<div class="radio">
				<label>
					<table style="border:1px solid black">
						<thead>
							<td> Select</td>
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
							<td> <input type="radio" id="flight" name="flight" value="BHZ-LNK-844" style="margin-left: 12px; margin-top: -5px;">  </td>
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
				</label>
			</div> 
				<input type="button" class="btn btn-danger" value="Back to Search page" onclick="window.location='flightsearchquery.jsp';" > 
				<input type="button" class="btn btn-warning" value="See booking history page" onclick="window.location='bookinghistory.jsp';" >
				<input type="submit" class="btn btn-success" name="send" value="Choose flight" align="right" >
		</form>
	</div>
	<br><br><button type="button" class="btn btn-default"  onClick="window.location='login.jsp'"><b>Logout</b></button>
</body>
</html>