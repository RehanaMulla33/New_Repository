package com.xworkz.DB.Dao;

public class RedBus_Tester {

	public static void main(String[] args) {
		
		FlightBook fb=new FlightBook();
		
		fb.getMyBooking(1236754);
		fb.onDate("12/12/2021", "15/12/2021");
		fb.search("Bangalore","Hyderabad");
	}

}
