package utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;
//TODO update user
public class UserDAO {
	private final String HOST_ADDRESS = "cse.unl.edu";
	private final String USER_DATABASE = "mmoraesg";
	private final String USERNAME = "mmoraesg";
	private final String PASSWORD = "haremsc4r3m";
	private final String CSE_DATABASE = "cse464";

	/*
	 * We are going to use a CRUD to access the Objects at the Database
	 */
	public UserDAO() {

	}

	
	public User readUser(User user) {
		// (String host, String db, String user, String password){
		JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, USERNAME,
				PASSWORD);
		ArrayList<Object> param = new ArrayList<Object>();
		/**
		 * param.add("Hello"); param.add(35767); param.add(4.0);
		 * param.add(Timestamp.valueOf("2014-09-30 11:41:00"));
		 */
		param.add(user.getName());
		param.add(user.getPassword());
		ResultSet rs1 = jdbc
				.queryDB(
						"SELECT user.username, user.password FROM user WHERE user.username =? AND user.password =?;",
						param);

		try {
			if (rs1 != null) {
				User returnUser = new User();
				returnUser.setName(rs1.getString("username"));
				returnUser.setPassword(rs1.getString("password"));
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
		JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, USERNAME,
				PASSWORD);
		ArrayList<Object> param = new ArrayList<Object>();
		param.add(user.getName());
		param.add(user.getPassword());
		try {
			ResultSet rs1 = jdbc.queryDB(
					"INSERT INTO user (username, password) VALUES (?, ?);",
					param);

			jdbc.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void removeUser(User user) {
		JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, USERNAME,
				PASSWORD);
		ArrayList<Object> param = new ArrayList<Object>();
		param.add(user.getName());
		try {
			ResultSet rs1 = jdbc.queryDB("DELETE user WHERE (username = ?);",
					param);

			jdbc.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
