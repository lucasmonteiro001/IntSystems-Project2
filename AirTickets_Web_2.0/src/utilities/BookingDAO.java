package utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import model.Book;
import model.User;
//TODO EVERYTHING OF BOOKING
public class BookingDAO {
	private final String HOST_ADDRESS = "cse.unl.edu";
	private final String USER_DATABASE = "mmoraesg";
	private final String USERNAME = "mmoraesg";
	private final String PASSWORD = "haremsc4r3m";
	private final String CSE_DATABASE = "cse464";

	/*
	 * We are going to use a CRUD to access the Objects at the Database
	 */
	public BookingDAO() {

	}

	public void addBooking(Book book) {
		JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, USERNAME,
				PASSWORD);
		ArrayList<Object> param = new ArrayList<Object>();
		//param.add(new Date());
		//param.add(book.getBookingId());
		param.add(book.getFlightIds());
		param.add(book.getNumberOfSeats());
		param.add(book.getAccountId());
		param.add(book.getUserId());
		param.add(book.getTotalCost());
		


		try {
			ResultSet rs1 = jdbc.insertDB(
					"INSERT INTO mmoraesg.booking (date_of_booking, flight_ids, number_of_seats, account_id, user_id, total_cost) VALUES (curdate(), ?, ?, ?, ?, ?);",
					param);

			jdbc.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
