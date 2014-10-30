<%@ include file="../head.jsp" %>

<% 
	String curUrl= request.getRequestURL() + "";
	String []str = curUrl.split("/");
	String test = str[str.length - 1];
%>

<body> 
	<div class="container">
		<nav class="navbar navbar-default" role="navigation">
		    <div class="container-fluid">
		        
		        <div class="navbar-header">
		          <a class="navbar-brand" href="#"><b>Air Minas</b></a>
		        </div>
		
		
		        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
		            <ul class="nav navbar-nav">
		                <li class="active"><a href="#"><%= test %></a></li>
		            </ul>
		            <ul class="nav navbar-nav navbar-right">
		                <li><img class="logo" src="style/airplane.png"></li>
		                <li><img class="logo" src="style/background-mg.png"></li>
		                <!-- Check if there's a session -->
		                <%
		                	if (session.getAttribute("email") != null) {
		                %>
			                <li class="divider-vertical"></li>
			                <li><a href="#"><span class="glyphicon glyphicon-off black">&nbsp</span>Logout</a></li>
			            <% } %>
		            </ul>
		        </div>
		    </div>
		</nav> 
		
		