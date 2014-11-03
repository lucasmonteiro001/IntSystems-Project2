<%@page import="java.util.*"%>
<%@ include file="../head.jsp"%>

<%
	String curUrl = request.getRequestURL() + "";
	String[] str = curUrl.split("/");
	String currPage = str[str.length - 1];

	Map<String, String> pages = new HashMap<String, String>();
	pages.put("login.jsp", "Login");
	pages.put("flightsearchquery.jsp", "Flight search");
	pages.put("transaction.jsp", "Transaction");
	pages.put("bookinghistory.jsp", "Booking History");
	pages.put("registration.jsp", "Registration");
	pages.put("reviewandbook.jsp", "Review and Book");
	pages.put("flightsearchresult.jsp",
			"Flights that match your search");
	pages.put("transactionconfirmationpage.jsp",
			"Transaction confirmation");
%>

<% if (session.getAttribute("user") != null) { %>
 		<jsp:useBean id="user" class="model.User" scope="session" />
<% } %>


<body>
	<div class="container">
		<nav class="navbar navbar-default" role="navigation">
			<div class="container-fluid">

				<div class="navbar-header">
					<a class="navbar-brand" href="#"><b>Air Minas</b></a>
				</div>


				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#"> <%
 	if (pages.get(currPage) != null) {
 %>
								<%=pages.get(currPage)%> <%
 	}
 %>
						</a></li>
						<!-- Check if there's a session -->
						<%
							if (session.getAttribute("email") != null
									&& !currPage.equals("bookinghistory.jsp")) {
						%>
						<li><a href="bookinghistory.jsp"> Booking history </a></li>
						<%
							}
						%>

					</ul>
					<ul class="nav navbar-nav navbar-right">
						<li><img class="logo" src="style/airplane.png"></li>
						<li><img class="logo" src="style/background-mg.png"></li>
						<!-- Check if there's a session -->
						<%
							if (session.getAttribute("user") != null
									&& !currPage.equals("login.jsp")
									&& !currPage.equals("registration.jsp")) {
						%>
						<li class="divider-vertical"></li>
						<li><a href="Logout"><span
								class="glyphicon glyphicon-off black">&nbsp</span> <jsp:getProperty
									property="email" name="user" /> </a></li>
						<%
							}
						%>
					</ul>
				</div>
			</div>
		</nav>