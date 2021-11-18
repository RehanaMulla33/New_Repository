package com.xworkz.DB.ScannerDao;

public interface ScannerInterface {
	public  ScannerDto createScannerObj(String color, String brand, String price, String type);
	public void displayInfo(ScannerDto object);
	public  ScannerDto updateByBrand(ScannerDto object, String brand);

}
