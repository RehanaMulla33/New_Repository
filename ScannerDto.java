package com.xworkz.DB.ScannerDao;

public class ScannerDto {
	private String color;
	private String brand;
	private String price;
	private String type;
	
	public ScannerDto(String color, String brand, String price, String type) {
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	

}
