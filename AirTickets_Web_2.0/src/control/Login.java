package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.If;

import model.User;
/**
 * In this class the server will receive the attempt to login and will process it. 
 * 
 */
/**
 * @author Mateus
 *
 */
public class Login extends HttpServlet {
	private User user;
	private Users us;

	/**
	 * This doGet is "just in cause". Will not be used in this application. Call doPost.
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * This doPost calls the servlet Users to get if the user exists or not. The it redirects for the appropriate page.
	 * @param request HttpServletRequest with information of request like username and password.
	 * @param response HttpServletResponse with information of where to go in case if the username exists or not
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		user = new User(request.getParameter("username"),
				request.getParameter("password"));

		us = new Users();

		if (us.getP().userExist(user) == true) { 
			response.sendRedirect("flightsearchquery.jsp");

		} else {
			response.sendRedirect("registration.jsp");
		}

	}

}
