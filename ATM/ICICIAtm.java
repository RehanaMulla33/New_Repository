package com.xworkz.DB.Dao;

public class ICICIAtm implements ATMinterface{

	@Override
	public void cashwithdrawl(int card_no, int password) {
		System.out.println("cash withdraw is successful");
	}

	@Override
	public void deposit(int amount, int accnt_no) {
		System.out.println("cash deposited is successful");
	}

	@Override
	public void ministatement(int card_no, int password) {
		System.out.println("Mini statement successful");
	}
	
	
	

}
