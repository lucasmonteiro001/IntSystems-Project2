<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style/bootstrap.css">
<title>Search for your flight</title>
</head>
<body>
<div class="container-fluid">
    <h3>Details of your travel: </h3>
	<form class="form-horizontal" role="form" name="input" action="flightsearchresult.jsp" method="post">
		<div class="form-group">
  			<label class="col-sm-2 control-label" for="source">Source</label>
  			<div class="col-sm-10">
  				<input type="textfield" class="form-group" id="source" placeholder="Source" name="source">
  			</div>	
		</div>
		<div class="form-group">
  			<label class="col-sm-2 control-label" for="destination">Destination</label>
  			<div class="col-sm-10">
  				<input type="textfield" class="form-group" id="destination" placeholder="Destination" name="destination">
  			</div>
		</div>
		<div class="form-group">
  		<label class="col-sm-2 control-label" for="number_of_seats">Number of seats</label>
  			<div class="col-sm-10">
  				<input type="textfield" class="form-group" id="number_of_seats" placeholder="Number of seats" name="number_of_seats">
  			</div>
		</div>
		<div class="form-group">
  			<label class="col-sm-2 control-label" for="class">Class</label>
  			<div class="col-sm-10">
				<select class="form-group" id="class" name="class">
		    		<option value="economy">Economy</option>
		    		<option value="business">Business</option>
		    		<option value="firstclass">First Class</option>
		    	</select>
		    </div>
    	</div>
		<button type="button" class="btn btn-danger col-md-offset-2" value="Exit" onClick="window.location='login.jsp'">Exit</button>
		<button type="submit" class="btn btn-success" value="Search">Search</button>
	</form> 
	<br><br><button type="button" class="btn btn-default"  onClick="window.location='login.jsp'"><b>Logout</b></button>    
</div>
</body>
</html>

