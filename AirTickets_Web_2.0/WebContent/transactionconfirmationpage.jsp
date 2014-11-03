<%
 	if (session.getAttribute("email") == null) {
 		response.sendRedirect("loginError.jsp");
 	}
 %>
 
<jsp:include page="header.jsp"/>

	<h3>Order received! Your flight has been reserved. See you soon!</h3>

	<p>
		Thank your for flying <b>Air Minas</b>. Click <a
			href="flightsearchquery.jsp"> here </a> to continue flying!
	</p><br>

	<button type="button" class="btn btn-primary btn-sm"  onClick="window.location='flightsearchquery.jsp'"><b>Home</b></button>
	
<jsp:include page="bottom.jsp"/>