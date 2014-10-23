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
<title>Transaction Information</title>
</head>
<body>
	
	<h2>Confirmation and account information</h2>

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
	</table><br>
	
	<form class="form-horizontal" role="form" name="input" action="transactionconfirmationpage.jsp" method="post">
			<div class="form-group">
				<label class="col-sm-2 control-label" for="accHolderName">Account holder name</label>
				<div class="col-sm-10">
					<input type="textfield" class="form-group" id="accHolderName" placeholder="Account holder name" name="accHolderName">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label" for="routNumber">Routing number</label>
				<div class="col-sm-10">
					<input type="textfield" class="form-group" id="routNumber" placeholder="Routing number" name="routNumber">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label" for="accNumber">Account number</label>
				<div class="col-sm-10">
					<input type="textfield" class="form-group" id="accNumber" placeholder="Account number" name="accNumber">
				</div>
			</div>
			<input class="col-sm-offset-2 btn btn-success" type="submit" value="Submit">
		</form>
</body>
</html>