package com.CTS.sampleproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Parameterization {

	static String fileName = "C:\\Users\\blaxm\\workspace\\sampleproject\\resource\\DataSheet.xlsx";
	static FileInputStream FIS;
	static XSSFWorkbook XSF;
	static PojoClass pojoClass;
	static Object[][] data;
	
	
	public static void main (String arg[]) throws IOException{
		Parameterization.readExcelData("Login");
	}
	
	public static Object[][] readExcelData(String testCaseName) throws IOException {

		FIS = new FileInputStream(fileName);

		XSF = new XSSFWorkbook(FIS);

		pojoClass = new PojoClass();

//		data = new HashMap<Object, Object>();
		
		

		int rowCount = XSF.getSheetAt(0).getLastRowNum();

		for (int i = 1; i < rowCount ; i++) {
			
			int colCount = XSF.getSheetAt(0).getRow(i).getLastCellNum();
			
			System.out.println(colCount);

			for(int j=0; j<colCount-1; j++){
				
				 data = new Object[i][j];
				
				 data[i][j]=XSF.getSheetAt(0).getRow(j).getCell(0).getStringCellValue();
				
				if(pojoClass.testCaseName.equalsIgnoreCase(testCaseName)){
					
					data[i][j]=XSF.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
					
					System.out.println(data[i][j]);

					data[i][j]=XSF.getSheetAt(0).getRow(i).getCell(2).getStringCellValue();
					
					System.out.println(data[i][j]);

					data[i][j]=XSF.getSheetAt(0).getRow(i).getCell(3).getNumericCellValue();
					
					System.out.println(data[i][j]);

					data[i][j]=XSF.getSheetAt(0).getRow(i).getCell(4).getNumericCellValue();
					
					System.out.println(data[i][j]);

					data[i][j]=XSF.getSheetAt(0).getRow(i).getCell(5).getNumericCellValue();
					
					System.out.println(data[i][j]);

					data[i][j]=XSF.getSheetAt(0).getRow(i).getCell(6).getStringCellValue();
					
					System.out.println(data[i][j]);

					data[i][j]=XSF.getSheetAt(0).getRow(i).getCell(7).getStringCellValue();
					
					System.out.println(data[i][j]);

					data[i][j]=XSF.getSheetAt(0).getRow(i).getCell(8).getNumericCellValue();
					
					System.out.println(data[i][j]);

					data[i][j]=XSF.getSheetAt(0).getRow(i).getCell(9).getStringCellValue();
					
					System.out.println(data[i][j]);
					
					
				}
				
			}
			
			

		}
//		return pojoClass;
		return data;
		

	}

}
