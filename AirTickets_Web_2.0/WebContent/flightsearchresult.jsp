
<%
	if (session.getAttribute("user") == null) {
		response.sendRedirect("loginError.jsp");
	}
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="header.jsp" />


<div class="well well-sm span4">
	<h4 style="display: inline">Choose your flight</h4>

	<br> <br>
	<p style="disply: block">Choose your destiny and when you want to
		go.</p>

	<form name="input" action="FlightSearchResult" method="post" role="form">

		<table class="table table-hover" style="background-color: white">
			<thead>
				<tr>
					<th>Select</th>
					<th>Date</th>
					<th>From</th>
					<th>To</th>
					<th>Flight Number</th>
					<th>Departure Time</th>
					<th>Arrival Time</th>
					<th>Number of Stops</th>
					<th>Cost</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="flightBean" items="${requestScope['flights']}">
					<tr>
						<td><input type="radio" name="choosenFlight" value="${flightBean.id}"></td>
						<td><c:out value="${flightBean.departure}" /></td>
						<td><c:out value="${flightBean.source}" /></td>
						<td><c:out value="${flightBean.plane}" /></td>
						<td><c:out value="${flightBean.destination}" /></td>
						<td><c:out value="${flightBean.departure}" /></td>
						<td><c:out value="${flightBean.arrival}" /></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
		<input type="button" class="btn" value="Back to Search page"
			onclick="window.location='flightsearchquery.jsp';"> <input
			type="button" class="btn" value="See booking history page"
			onclick="window.location='BookingHistory';"> <input
			type="submit" class="btn btn-primary" name="send"
			value="View and Book" align="right">
	</form>
</div>

<jsp:include page="bottom.jsp" />