package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utilities.AccountDAO;
import model.Account;

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
		AccountDAO accountDao = new AccountDAO();
		
		account.setHolderId(Integer.parseInt (request.getParameter("accountHolderId").toString()));
		account.setRoutingNumber(Integer.parseInt (request.getParameter("accountRoutingNumber").toString()));
		
		account = accountDao.readAccount(account);
		
		if (account.getBalance() - Double.parseDouble(session.getAttribute("totalCost").toString()) >= 0) {
			account.setBalance(account.getBalance() - Double.parseDouble(session.getAttribute("totalCost").toString()));
			accountDao.updateAccount(account);
			RequestDispatcher rd = request
					.getRequestDispatcher("transactionconfirmationpage.jsp");
			rd.forward(request, response);
		}
	}

}
