<%
	if (session.getAttribute("user") == null) {
		response.sendRedirect("LoginError");
	}
%>

<jsp:useBean id="flightBean" class="model.Flight" scope="session"/>
<jsp:useBean id="booking" class="model.Book" scope="session"/>

<jsp:include page="../header.jsp" />

<h3>Order received! Your flight has been reserved. See you soon!</h3>

<p>
	Thank your for flying <b>Air Minas</b>. Click <a
		href="flightsearchquery.jsp"> here </a> to continue flying!
</p>
<br>

<p>
<ul>
	<h4>Your order: </h4>
	<li>Departure: <jsp:getProperty property="departure" name="flightBean" /></li>
	<li>Source: <jsp:getProperty property="source" name="flightBean" /></li>
	<li>Destination: <jsp:getProperty property="destination" name="flightBean" /></li>
	<li>Flight: <jsp:getProperty property="id" name="flightBean" /></li>
	<li>Arrival: <jsp:getProperty property="arrival" name="flightBean" /></li>
	<li>Number of Stops: 1</li>
	<li>Total cost: $<%=session.getAttribute("totalCostFormatted")%></li>
	<li>Number of seats: <jsp:getProperty property="numberOfSeats" name="booking" /></li>
</ul>
</p>

<button type="button" class="btn btn-primary btn-sm"
	onClick=window.print()>
	<b>Print page</b>
</button>
<button type="button" class="btn btn-primary btn-sm"
	onClick="window.location='flightsearchquery.jsp'">
	<b>Home</b>
</button>

<jsp:include page="../bottom.jsp" />