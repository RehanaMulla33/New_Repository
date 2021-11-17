package com.xworkz.DB.Dao;

public interface RedBusInterface {
	public void search(String source, String destination);
	public void onDate(String departureDtae, String returnDate);
	public void getMyBooking(int bookingRefNum);
	

}
