package com.mystore.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.mystore.utility.ExcelLibrary;

public class DataProviders {
	
	ExcelLibrary obj = new ExcelLibrary();

	@DataProvider
	public Object[][] loginData() {
		Object[][] arrayObject = null;
		try {
			arrayObject = obj.getExcelData("login");
		} catch (IOException e) {
			System.out.println("Cath block");
			e.printStackTrace();
		}
		return arrayObject;
	}
}
