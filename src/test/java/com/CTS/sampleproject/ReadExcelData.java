package com.CTS.sampleproject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelData {

	static String fileName = "C:\\Users\\blaxm\\workspace\\sampleproject\\resource\\DataSheet.xlsx";
	static FileInputStream FIS;
	static XSSFWorkbook XSF;
	static PojoClass pojoClass;
	static Map<Object, Object> data;

	public static Map<Object, Object> readExcelData(String testCaseName) throws IOException {

		FIS = new FileInputStream(fileName);

		XSF = new XSSFWorkbook(FIS);

		pojoClass = new PojoClass();

		data = new HashMap<Object, Object>();

		int count = XSF.getSheetAt(0).getLastRowNum();

		for (int i = 1; i < count + 1; i++) {

			pojoClass.setTestCaseName(XSF.getSheetAt(0).getRow(i).getCell(0).getStringCellValue());

			if (pojoClass.testCaseName.equalsIgnoreCase(testCaseName)) {

				pojoClass.setUserName(XSF.getSheetAt(0).getRow(i).getCell(1).getStringCellValue());

				pojoClass.setPassword(XSF.getSheetAt(0).getRow(i).getCell(2).getStringCellValue());

				pojoClass.setNroAccount(XSF.getSheetAt(0).getRow(i).getCell(3).getNumericCellValue());

				pojoClass.setNreAccount(XSF.getSheetAt(0).getRow(i).getCell(4).getNumericCellValue());

				pojoClass.setRoutine(XSF.getSheetAt(0).getRow(i).getCell(5).getNumericCellValue());

				pojoClass.setFirstName(XSF.getSheetAt(0).getRow(i).getCell(6).getStringCellValue());

				pojoClass.setLastName(XSF.getSheetAt(0).getRow(i).getCell(7).getStringCellValue());

				pojoClass.setAmount(XSF.getSheetAt(0).getRow(i).getCell(8).getNumericCellValue());

				pojoClass.setMoneyType(XSF.getSheetAt(0).getRow(i).getCell(9).getStringCellValue());

				break;
			}

		}

		data.put(pojoClass.testCaseName, pojoClass);
		data.put(pojoClass.userName, pojoClass);
		data.put(pojoClass.password, pojoClass);
		data.put(pojoClass.nreAccount, pojoClass);
		data.put(pojoClass.nroAccount, pojoClass);
		data.put(pojoClass.routine, pojoClass);
		data.put(pojoClass.firstName, pojoClass);
		data.put(pojoClass.lastName, pojoClass);
		data.put(pojoClass.amount, pojoClass);
		data.put(pojoClass.moneyType, pojoClass);

		return data;

	}

}
