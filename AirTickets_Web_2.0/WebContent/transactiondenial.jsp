<%
 	if (session.getAttribute("user") == null) {
 		response.sendRedirect("loginError.jsp");
 	}
 %>
 
<jsp:include page="header.jsp"/>

	<h3>Sorry, your order could not be processed.</h3>

	<p>
		
		Thank your for choose <b>Air Minas</b>. <br/>
		
		<p><%= session.getAttribute("reason") %></p>
		<br/>
		Click <a
			href="flightsearchquery.jsp"> here </a> to try again!
	</p><br>

	<button type="button" class="btn btn-primary btn-sm"  onClick="window.location='flightsearchquery.jsp'"><b>Home</b></button>
	
<jsp:include page="bottom.jsp"/>