<%
 	if (session.getAttribute("user") == null) {
 		response.sendRedirect("LoginError");
 	}
 %>
 
<jsp:include page="../header.jsp"/>
	You have provided incorrect account information.<br>
	Click <span onclick="window.history.back()" style="cursor:pointer"><a>here</a></span> to provide it again or 
<span onclick="window.location='flightsearchquery.jsp';" style="cursor:pointer"><a>here</a></span> to be redirected to the search page.
	
<jsp:include page="../bottom.jsp"/>