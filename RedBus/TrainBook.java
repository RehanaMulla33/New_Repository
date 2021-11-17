package com.xworkz.DB.Dao;

public class TrainBook  implements RedBusInterface{
	public void search(String source, String destination) {
		System.out.println("Via from Goa - To Mumbai search buses");		
	}

	
	public void onDate(String departureDtae, String returnDate) {
		System.out.println("Detarture On 18/11/2021- Return date 22/11/2021");
	}

	
	public void getMyBooking(int bookingRefNum) {
		System.out.println("Entered  referance number is matching ");
		
	}



}
