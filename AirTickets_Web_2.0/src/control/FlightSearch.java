package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utilities.FlightSearchDAO;
import model.Flight;
import model.User;

/**
 * Servlet implementation class FlightSearch
 */
public class FlightSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FlightSearchDAO searchFlightDao;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FlightSearch() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Just can work  if a session is there
		HttpSession session = request.getSession();
		if (session.getAttribute("email").equals(null)) {
			response.sendRedirect("invalidSession.jsp");
		}
		else {
			ArrayList <Flight> flights;
			if (request.getParameter("source") != null 
				&& request.getParameter ("destination") != null) {
				Flight flight = new Flight ();
				session.setAttribute("source", request.getParameter("source"));
				session.setAttribute("destination", request.getParameter("destination"));
				flight.setDestination(session.getAttribute("destination").toString());
				flight.setSource(session.getAttribute("source").toString());
				if ((request.getParameter("departure") != null || !request.getParameter("departure").toString().equals("MM/DD/YYYY")) ){
					session.setAttribute("departure", request.getParameter("departure"));
					searchFlightDao = new FlightSearchDAO();
					System.out.println (session.getAttribute("departure"));
					Date departure = new Date (session.getAttribute("departure").toString());
					flight.setDeparture(departure);
					flights = searchFlightDao.readFlight(flight);
					
				}
				request.setAttribute("flights", flights);
				RequestDispatcher rd = request.getRequestDispatcher("flightsearchresult.jsp");
				rd.forward(request, response);
			}
		}
	}
}
