package utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import control.BookingHistory;
import model.Book;
import model.BookingHistoryModel;
import model.User;

/**
 * BookingHistoryDAO class to manage the Historic of bookings.
 * @author Mateus
 *
 */
public class BookingHistoryDAO {
	private final String HOST_ADDRESS = "cse.unl.edu";
	private final String USER_DATABASE = "mmoraesg";
	private final String USERNAME = "mmoraesg";
	private final String PASSWORD = "haremsc4r3m";
	private final String CSE_DATABASE = "cse464";

	/*
	 * We are going to use a CRUD to access the Objects at the Database
	 */
	public BookingHistoryDAO() {

	}
/**
 * Get the booking history requested by the current user.
 * @param user
 * @return ArrayList <BookingHistoryModel>
 */
	public ArrayList<BookingHistoryModel> getBookingHistory(User user) {

		JDBCHelper jdbc = new JDBCHelper(HOST_ADDRESS, USER_DATABASE, USERNAME,
				PASSWORD);

		ArrayList<Object> param = new ArrayList<Object>();
		ArrayList<BookingHistoryModel> bookingHistory = new ArrayList<BookingHistoryModel>();

		param.add(user.getId());

		ResultSet rs1 = jdbc
				.queryDB(
						"SELECT b.date_of_booking, f.source, f.destination, f.id, f.departure, f.arrival, b.total_cost "
						+ "FROM mmoraesg.user u, mmoraesg.booking b, mmoraesg.booking_flight bf, cse464.flights f "
						+ "WHERE  u.id = ? AND u.id = b.user_id AND b.id = bf.booking_id AND bf.flight_id = f.id;",
						param);

		try {
			while (rs1 != null && rs1.next()) {
				
				BookingHistoryModel book =  new BookingHistoryModel();
				
				book.setArrival(rs1.getTimestamp("arrival"));
				book.setDate_of_booking(rs1.getTimestamp("date_of_booking"));
				book.setDeparture(rs1.getTimestamp("departure"));
				book.setDestination(rs1.getString("destination"));
				book.setFlight_id(rs1.getString("id"));
				book.setSource(rs1.getString("source"));
				book.setTotal_cost(rs1.getString("total_cost"));

				bookingHistory.add(book);
			}
			jdbc.conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return bookingHistory;
	}

}
