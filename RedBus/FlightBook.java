package com.xworkz.DB.Dao;

public class FlightBook implements RedBusInterface {

	
	public void search(String source, String destination) {
		System.out.println("Via from bangalore -Hyderabad search buses");		
	}

	
	public void onDate(String departureDtae, String returnDate) {
		System.out.println("Detarture On 16/11/2021- Return date 25/11/2021");
	}

	
	public void getMyBooking(int bookingRefNum) {
		System.out.println("Entered  referance number is matching ");
		
	}


	
	
	

}
