<%@page import="java.util.ArrayList"%>
<%@page import="model.BookingHistoryModel"%>
<%
 	if (session.getAttribute("user") == null) {
 		response.sendRedirect("LoginError");
 	}
 %>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<jsp:include page="../WEB-INF/classes/header.jsp"/>

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
				<%
					ArrayList<BookingHistoryModel> arr = (ArrayList<BookingHistoryModel>)session.getAttribute("bookingHistory");
				
					BookingHistoryModel b = new BookingHistoryModel();
					
					for (int i = 0; i < arr.size(); i++) {
						b = arr.get(i);
				%>
					<tr>
						<td> <%= b.getDate_of_booking() %> </td>
						<td> <%= b.getSource() %> </td>
						<td> <%= b.getDestination() %> </td>
						<td> <%= b.getFlight_id() %> </td>
						<td> <%= b.getDeparture() %> </td>
						<td> <%= b.getArrival() %> </td>
						<td> 1 </td>
						<td> <%= b.getTotal_cost() %> </td>
					</tr>
				<% } %>			
			</tbody>
		</table>
	</div>
	<br>
	<button type="button" class="btn btn-primary btn-sm"  onClick="window.location='flightsearchquery.jsp'"><b>Home</b></button>
</body>
</html>