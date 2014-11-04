<%
 	if (session.getAttribute("user") == null) {
 		response.sendRedirect("loginError.jsp");
 	}
 %>
 
<jsp:include page="header.jsp"/>

	<h3>You have choosen this flight</h3>
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
	<input type="button" class="btn btn-sm" value="Back to see the flights"
		onclick="window.history.back();">
	<input type="submit" class="btn btn-primary btn-sm" name="send" value="Confirm" align="right"
		onclick="window.location='transaction.jsp';">
		
<jsp:include page="bottom.jsp"/>