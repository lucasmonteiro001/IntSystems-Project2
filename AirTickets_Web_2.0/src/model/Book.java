package model;

import java.util.ArrayList;
import java.util.Date;

public class Book {

	private int id;
	private int bookingId;
	private Date dateOfBooking;
	private int flightIds;
	private int numberOfSeats;
	private String email;
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

	public int getFlightIds() {
		return flightIds;
	}

	public void setFlightIds(int flightIds) {
		this.flightIds = flightIds;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
