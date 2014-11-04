package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Book;
import model.Flight;
import model.User;

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
    private HttpSession session;  
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
		session = request.getSession();
		Flight flight = getChoosenFlight (request);
		Book book = new Book ();
		User usr = (User) session.getAttribute("user");
		book.setEmail(usr.getEmail());
		book.setFlightIds(flight.getId());
		book.setDateOfBooking(flight.getDeparture());
		book.setNumberOfSeats(flight.getBusinessClassReserved()+flight.getEconomyClassReserved()+flight.getFirstClassReserved());
		//book.setTotalCost(flight.get);
	}
	

}
