package com.xworkz.DB.ScannerDao;

public class ScannerImpDao extends ScannerDto implements ScannerInterface {

	public ScannerImpDao(String color, String brand, String price, String type) {
		super(color, brand, price, type);
		System.out.println("Inside DAO constructor");
	}

	public ScannerDto createScannerObj(String color, String brand, String price, String type) {
		System.out.println("Inside create method");
		ScannerDto scanDto = new ScannerDto(color, brand, price, type);

		return scanDto;
	}

	public void displayInfo(ScannerDto object) {
		System.out.println("Inside the dispaly method");
		System.out.println(object.getBrand());
		System.out.println(object.getColor());
		System.out.println(object.getPrice());
		System.out.println(object.getType());

	}

	public ScannerDto updateByBrand(ScannerDto object, String brand) {
		System.out.println("Inside the dispaly method");
		object.setColor("HP");
		return object;
	}

}
