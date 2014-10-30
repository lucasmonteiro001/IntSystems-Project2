package utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;
//TODO update user
public class UserDAO {
	private final String HOST_ADDRESS = "cse.unl.edu";
	private final String USER_DATABASE = "mmoraesg";
	private final String email = "mmoraesg";
	private final String PASSWORD = "haremsc4r3m";
	private final String CSE_DATABASE = "cse464";

	/*
	 * We are going to use a CRUD to access the Objects at the Database
	 */
	public UserDAO() {

	}

	
	public User readUser(User user) {
		// (String host, String db, String user, String password){
		JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, email,
				PASSWORD);
		ArrayList<Object> param = new ArrayList<Object>();
		/**
		 * param.add("Hello"); param.add(35767); param.add(4.0);
		 * param.add(Timestamp.valueOf("2014-09-30 11:41:00"));
		 */
		param.add(user.getEmail());
		ResultSet rs1 = jdbc
				.queryDB(
						"SELECT user.email FROM user WHERE user.email =?;",
						param);

		try {
			if (rs1 != null) {
				User returnUser = new User();
				returnUser.setEmail(rs1.getString("email"));
				returnUser.setPassword(rs1.getString("password"));
				returnUser.setDateOfBirth(rs1.getDate("date_of_birth"));
				
				return returnUser;
			}
			jdbc.conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	// TODO criar os campos de usuario tal qual o ERD disponibilizado.
	public void addUser(User user) {
		JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, email,
				PASSWORD);
		ArrayList<Object> param = new ArrayList<Object>();
		param.add(user.getEmail());
		param.add(user.getPassword());
		param.add(user.getDateOfBirth());
		try {
			ResultSet rs1 = jdbc.insertDB(
					"INSERT INTO user (email, password, date_of_birth) VALUES (?, ?, ?);",
					param);

			jdbc.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void removeUser(User user) {
		JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, email,
				PASSWORD);
		ArrayList<Object> param = new ArrayList<Object>();
		param.add(user.getName());
		try {
			ResultSet rs1 = jdbc.queryDB("DELETE user WHERE (email = ?);",
					param);

			jdbc.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
