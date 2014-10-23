package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import model.User;

/**
 * This class is responsible for handle the properties file of the archive.
 * 
 * @author Lucas
 *
 */
public class PropertiesFileHandler {

	public Properties p;
	private FileInputStream fis = null;
	private String propFilePath = "/Users/lucas/git/InternetProgrammingF/AirTickets_Web/src/Model/users.properties";

	/**
	 * This constructor method initialize the file.
	 */
	public PropertiesFileHandler() {

		p = new Properties();

		try {

			fis = new FileInputStream(propFilePath);

			p.load(fis);

		} catch (FileNotFoundException e) {

			System.out.println("FileNotFound");

		} catch (IOException e) {

			System.out.println("IOEXCeption");

		} finally {

			if (null != fis) {

				try {

					fis.close();

				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		}
	}

	/**
	 * This method returns false if the user doesn`t exist and returns true if it exists.
	 * @param user
	 * @return bool_value
	 */
	public boolean userExist(User user) {

		boolean exists = false;

		String pass = p.getProperty(user.getName());

		if (pass == null)
			exists = false;
		else {

			String hashedPwd = "" + user.getPassword().hashCode();
			user.setPassword(hashedPwd);

			if (pass.equals(user.getPassword()))
				exists = true;
			else
				exists = false;

		}

		return exists;

	}
	/**
	 * This method receives a user and if it doesn't exist, it creates  a new User. (see userExist method)
	 * @param user
	 */
	public void addUser(User user) {

		p.setProperty(user.getName(), user.getPassword());

		try {

			p.store(new FileOutputStream(propFilePath), null);

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
	/**
	 * This method prints all the users that are registered at the system.
	 */
	public void printUsers() {

		Enumeration<?> e = p.propertyNames();
		String username = null;
		String pwd = null;

		while (e.hasMoreElements()) {
			username = (String) e.nextElement();
			pwd = p.getProperty(username);

			System.out.println(username + ":" + pwd);
		}

	}

}
