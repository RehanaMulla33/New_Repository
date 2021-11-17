package Dao;

public class Paytm implements OnlineTransferDao {
	public  void mobileRecharge(int Mobile_no, String subscriber) {
		
		System.out.println("Mobile Recharge succesful");
	}

	
	public void electricitypayment(int meterNo, String name) {
		System.out.println("Electric  Recharge bill payment succesful");
		
	}


	public void creditcardBill(int cardNo, int Mobile_no) {
		System.out.println("Credit card  Payment succesful");		
	}
	

}



