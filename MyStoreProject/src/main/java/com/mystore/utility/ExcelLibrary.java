package com.mystore.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary {
	public String excelPath =  System.getProperty("user.dir") + "/src/test/resources/TestData/TestData.xlsx";
	
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
		
	public String[][] getExcelData(String sheetName) throws IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet(sheetName);
		
		int rowCount= sheet.getLastRowNum();
		int cellcount = sheet.getRow(0).getLastCellNum();
		String[][] arrayExcelData = new String[rowCount][cellcount];
		
		 for(int i=1;i<=rowCount;i++)
		 {
            for(int j=0;j<cellcount;j++) {
            	arrayExcelData[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
            }
        }
		return arrayExcelData;
	}
}
