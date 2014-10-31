<%
 	if (session.getAttribute("email") == null) {
 		response.sendRedirect("loginError.jsp");
 	}
 %>
 
<jsp:include page="header.jsp"/>

	<div class="well well-sm span4">
		<h4 style="display:inline">Your booking history is below:</h4>
		
		<br><br>
		
		<table  class="table table-hover" style="background-color:white">
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
		</table>
	</div>
	<br>
	<button type="button" class="btn btn-primary btn-sm"  onClick="window.location='flightsearchquery.jsp'"><b>Home</b></button>
</body>
</html>