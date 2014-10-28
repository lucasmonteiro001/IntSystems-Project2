package control;

import java.io.FileWriter;
import java.util.Scanner;

import model.User;
import utilities.PropertiesFileHandler;
import utilities.UserDAO;
/**
 * 
 * @author Mateus
 * @author Lucas
 * 
 */
public class Users {

	private User user;
	private Scanner sc;
	private FileWriter fw;
	private UserDAO p = null;

	public Users() {

		user = new User();
		p = new UserDAO();
	}

	/**
	 * This method receives an user object containing its username and its password. Then, the method transforms into a hashedPassword and save it, in case that is not a repeated user.
	 * @param user information about the new user
	 * @return bool_val If the user is created returns true. Otherwise, returns false.
	 */
	public boolean createUser(User user) {
		p = new UserDAO();
		if (p.readUser(user) == null) {

			String hashedPassword = "";

			hashedPassword = "" + user.getPassword().hashCode();

			user.setPassword(hashedPassword);

			p.addUser(user);

			return true;

		} else {

			return false;
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PropertiesFileHandler getP() {
		return p;
	}

	public void setP(PropertiesFileHandler p) {
		this.p = p;
	}
	

}
