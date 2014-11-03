<%
 	if (session.getAttribute("user") == null) {
 		response.sendRedirect("loginError.jsp");
 	}
 %>
 
<jsp:include page="header.jsp"/>

<h3>Confirmation</h3>
<div class="well well-sm span4">

	<table class="table table-hover" style="background-color:white">
			<thead>
				<tr>
					<th> Date </th>
					<th> From </th>
					<th> To </th>
					<th> Flight Number </th>
					<th> Departure Time </th>
					<th> Arrival Time </th>
					<th> Number of Stops </th>
					<th> Cost </th>
				</tr>
			</thead>
			<tbody>
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
			</tbody>
		</table><br>
</div>

<h3>Account information</h3>
<div class="well well-sm span4">	
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
			<input class="col-sm-offset-2 btn btn-primary btn-sm" type="submit" value="Submit">
		</form>
</div>

<jsp:include page="bottom.jsp"/>