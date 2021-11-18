package com.xworkz.DB.ScannerDao;

import com.xworkz.DB.ScannerDao.ScannerDto;
import com.xworkz.DB.ScannerDao.ScannerDto;
import com.xworkz.DB.ScannerDao.ScannerInterface;
import com.xworkz.DB.ScannerDao.ScannerImpDao;


public class Scanner_Tester {

	public static void main(String[] args) {
		ScannerImpDao scanDao=new ScannerImpDao("Gray","HP","18000","Scanner");
		
		ScannerDto HP=new ScannerDto("Gray","HP","18000","Scanner");
		
		ScannerDao.displayInfo(HP);

	}

}
