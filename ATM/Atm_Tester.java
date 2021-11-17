package com.xworkz.DB.Dao;

public class Atm_Tester {

	public static void main(String[] args) {
		ICICIAtm atm=new ICICIAtm();
		
		atm.deposit(5000, 1237);
		atm.cashwithdrawl(1267934,1237);
		atm.ministatement(12367, 7867);

	}

}
