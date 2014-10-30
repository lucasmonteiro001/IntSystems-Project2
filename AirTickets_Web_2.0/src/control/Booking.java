package control;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Book;

/**
 * Servlet implementation class Booking
 */
public class Booking extends HttpServlet {
	
	/*
	 * id - int
	booking_id - int
	date_of_booking - date
	flight_ids - int (array)
	number_of_seats - int
	account_id - int (email)
	total_cost - double
	 */
	private static final long serialVersionUID = 1L;
	private final String BOOKING_ID = "bookingid";
	private final String DATE_OF_BOOKING = "dateofbooking";
	private final String NUMBER_OF_SEATS = "numberofseats";
	private final String BOOKING_EMAIL = "email";
	private final String TOTAL_COST = "totalcost";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Booking() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost (request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//TODO What is the best way to integrate Account, User and Booking?
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Book book = new Book ();
		book.setEmail(session.getAttribute("email").toString());
		//session.setAttribute(BOOKING_ID, request.getParameter(BOOKING_ID));
		session.setAttribute(DATE_OF_BOOKING, request.getParameter(DATE_OF_BOOKING));
		session.setAttribute(NUMBER_OF_SEATS, request.getParameter(NUMBER_OF_SEATS));
		session.setAttribute(BOOKING_EMAIL, request.getParameter(BOOKING_EMAIL));
		session.setAttribute(TOTAL_COST, request.getParameter(TOTAL_COST));
		//TODO Como fazer para passar multiplos valores mesmo? I.E. Cartao de Credito nos slides.
		book.setDateOfBooking ((Date) session.getAttribute(DATE_OF_BOOKING));
		//book.setFlightIds(flightIds);
		book.setNumberOfSeats(Integer.parseInt(session.getAttribute(NUMBER_OF_SEATS).toString()));
		book.setEmail(session.getAttribute(BOOKING_EMAIL).toString()); //De fato, o ideal seria usar  o id do usuario. Mas e a preguica de mexer com isso?
		book.setTotalCost((Double) session.getAttribute(TOTAL_COST));
		
	}

}
