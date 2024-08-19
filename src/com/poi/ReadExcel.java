package com.poi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src= new File("C:\\Users\\Adminstrator\\Desktop\\javatestfile.xlsx");
		FileInputStream fs= new FileInputStream(src);
		
		XSSFWorkbook wb= new XSSFWorkbook(fs);
		XSSFSheet sheet1= wb.getSheetAt(0);
		
		String data0= sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is... " + data0);
		
		String data1= sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is... " + data0);
		wb.close();
	}

}

