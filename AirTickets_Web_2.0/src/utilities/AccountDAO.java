package utilities;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Account;

public class AccountDAO {

		private final String HOST_ADDRESS = "cse.unl.edu";
		private final String USER_DATABASE = "mmoraesg";
		private final String USERNAME = "mmoraesg";
		private final String PASSWORD = "haremsc4r3m";
		private final String CSE_DATABASE = "cse464";

		/*
		 * We are going to use a CRUD to access the Objects at the Database
		 */
		public AccountDAO() {

		}

		
		public Account readAccount(Account account) {
			// (String host, String db, String user, String password){
			JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, USERNAME,
					PASSWORD);
			ArrayList<Object> param = new ArrayList<Object>();
			/**
			 * param.add("Hello"); param.add(35767); param.add(4.0);
			 * param.add(Timestamp.valueOf("2014-09-30 11:41:00"));
			 */
			param.add(account.getId());
			ResultSet rs1 = jdbc
					.queryDB(
							"SELECT user.email FROM user WHERE user.email =?;",
							param);

			try {
				if (rs1 != null) {
					Account returnAccount = new Account();
					returnAccount.setId(rs1.getInt("id"));
					returnAccount.setHolderId(rs1.getInt("holder_id"));
					returnAccount.setRoutingNumber(rs1.getInt("routing_number"));
					returnAccount.setBalance(rs1.getDouble("balance"));
					return returnAccount;
				}
				jdbc.conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}

		// TODO criar os campos de usuario tal qual o ERD disponibilizado.
		public void addUser(Account account) {
			JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, USERNAME,
					PASSWORD);
			ArrayList<Object> param = new ArrayList<Object>();
			param.add(account.getHolderId());
			param.add(account.getRoutingNumber());
			param.add(account.getBalance());
			try {
				ResultSet rs1 = jdbc.insertDB(
						"INSERT INTO account (holder_id, routing_number, balance) VALUES (?, ?, ?);",
						param);

				jdbc.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		public void removeAccount(Account account) {
			JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, USERNAME,
					PASSWORD);
			ArrayList<Object> param = new ArrayList<Object>();
			param.add(account.getId());
			try {
				ResultSet rs1 = jdbc.queryDB("DELETE account WHERE (id = ?);",
						param);

				jdbc.conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

