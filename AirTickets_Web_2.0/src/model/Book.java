package model;

import java.util.ArrayList;
import java.util.Date;

public class Book {

	private int id;
	private int bookingId;
	private Date dateOfBooking;
	private ArrayList<Integer> flightIds;
	private int numberOfSeats;
	private String userName;
	private double totalCost;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getDateOfBooking() {
		return dateOfBooking;
	}

	public void setDateOfBooking(Date dateOfBooking) {
		this.dateOfBooking = dateOfBooking;
	}

	public ArrayList<Integer> getFlightIds() {
		return flightIds;
	}

	public void setFlightIds(ArrayList<Integer> flightIds) {
		this.flightIds = flightIds;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public Book() {
		super();
	}

}
