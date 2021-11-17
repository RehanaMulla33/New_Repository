package com.xworkz.DB.Dao;

public interface ATMinterface {
	public void cashwithdrawl(int card_no,int password);
	public void deposit(int amount, int accnt_no);
	public void ministatement(int card_no,int  password);

}
