package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utilities.AccountDAO;
import utilities.BookingDAO;
import model.Account;
import model.Book;
import model.Flight;
import model.User;

/**
 * Servlet implementation class Transaction
 */
public class Transaction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HttpSession session;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transaction() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		session = request.getSession();
		Account account = new Account ();
		Book book = new Book ();
		User user = (User) session.getAttribute("user");
		Flight flight = (Flight) session.getAttribute("flightBean");
		AccountDAO accountDao = new AccountDAO();
		BookingDAO bookingDao = new BookingDAO();
		
		account.setHolderId(Integer.parseInt (request.getParameter("accountHolderId").toString()));
		account.setRoutingNumber(Integer.parseInt (request.getParameter("accountRoutingNumber").toString()));
		
		account = accountDao.readAccount(account);
		
		if (account.getBalance() - Double.parseDouble(session.getAttribute("totalCost").toString()) >= 0) {
			account.setBalance(account.getBalance() - Double.parseDouble(session.getAttribute("totalCost").toString()));
			accountDao.updateAccount(account);
			book.setFlightIds(flight.getId());
			book.setNumberOfSeats(Integer.parseInt(session.getAttribute("totalSeats").toString()));
			book.setTotalCost( Double.parseDouble(session.getAttribute("totalCost").toString()));
			book.setAccountId(account.getId());
			book.setUserId(user.getId());
			bookingDao.addBooking(book);
			RequestDispatcher rd = request
					.getRequestDispatcher("transactionconfirmationpage.jsp");
			rd.forward(request, response);
		}
		else {
			session.setAttribute("reason", "Your account number was rejected by your bank. Please contact them and try again.");
			RequestDispatcher rd = request
					.getRequestDispatcher("transactiondenial.jsp");
			rd.forward(request, response);
		}
	}

}
