package com.CTS.sampleproject;

import java.io.IOException;

import org.testng.annotations.Test;

public class Logout {

	@Test
	public void logout() throws Exception {
		
		ReadExcelData.readExcelData("Logout");
		
		System.out.println(ReadExcelData.pojoClass.testCaseName);

		System.out.println(ReadExcelData.pojoClass.userName);

		System.out.println(ReadExcelData.pojoClass.password);

	}
	
}
