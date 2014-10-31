package control;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utilities.SearchFlightDAO;
import model.Flight;
import model.User;

/**
 * Servlet implementation class FlightSearch
 */
public class FlightSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private SearchFlightDAO searchFlightDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Just can work  if a session is there
		HttpSession session = request.getSession();
		if (session.getAttribute("email").equals(null)) {
			response.sendRedirect("invalidSession.jsp");
		}
		else {
			if (request.getParameter("source") != null 
				&& request.getParameter ("destination") != null) {
				session.setAttribute("source", request.getParameter("source"));
				session.setAttribute("destination", request.getParameter("destination"));
				if (request.getParameter("departure") != null && request.getParameter("arrival") != null) {
					session.setAttribute("departure", request.getParameter("departure"));
					session.setAttribute("arrival", request.getParameter("arrival"));
					searchFlightDao = new SearchFlightDAO();
					Flight flight = new Flight ();
					flight.setArrival((Date) session.getAttribute("arrival"));
					flight.setDeparture((Date) session.getAttribute("departure"));
					flight.setDestination(session.getAttribute("destination").toString());
					flight.setSource(session.getAttribute("source").toString());
					
					searchFlightDao.readFlight(flight);
				}
				else {
					
				}
			}
		}
	}

}
