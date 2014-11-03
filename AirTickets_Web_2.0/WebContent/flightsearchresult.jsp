<%
 	if (session.getAttribute("user") == null) {
 		response.sendRedirect("loginError.jsp");
 	}
 %>


<jsp:include page="header.jsp"/>

<div class="well well-sm span4">
	<h4 style="display:inline">Choose your flight</h4>

	<br><br><p style="disply:block">Choose your destiny and when you want to go.</p>
	
	<form name="input" action="reviewandbook.jsp" method="post" role="form">

		<table class="table table-hover" style="background-color:white">
			<thead>
				<tr>
					<th> Select</th>
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
			</tbody>
		</table>
		<input type="button" class="btn" value="Back to Search page" onclick="window.location='flightsearchquery.jsp';" > 
		<input type="button" class="btn" value="See booking history page" onclick="window.location='bookinghistory.jsp';" >
		<input type="submit" class="btn btn-primary" name="send" value="Choose flight" align="right" >
	</form>
</div>

<jsp:include page="bottom.jsp"/>