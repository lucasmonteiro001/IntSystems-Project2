package control;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utilities.BookingHistoryDAO;
import model.Book;
import model.BookingHistoryModel;
import model.Flight;
import model.User;

/**
 * Servlet implementation class Booking
 */
public class BookingHistory extends HttpServlet {
	
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
    public BookingHistory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		BookingHistoryDAO bHDAO = new BookingHistoryDAO();
		
		ArrayList<model.BookingHistoryModel> booking;
		User user = (User) session.getAttribute("user");
		
		booking = bHDAO.getBookingHistory(user);
		
		session.setAttribute("bookingHistory", booking);
		
		RequestDispatcher rd = request
				.getRequestDispatcher("WEB-INF/bookinghistory.jsp");
		
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//TODO What is the best way to integrate Account, User and Booking?
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	

}
