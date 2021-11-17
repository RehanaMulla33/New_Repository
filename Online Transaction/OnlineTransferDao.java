package Dao;

public interface OnlineTransferDao {
	
	public void mobileRecharge(int Mobile_no,String subscriber);
	
	public void electricitypayment(int meterNo,String name );
	
	public void  creditcardBill(int cardNo, int Mobile_no);
	

}
