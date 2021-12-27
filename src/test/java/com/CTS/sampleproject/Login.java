package com.CTS.sampleproject;

import org.testng.annotations.Test;

public class Login {

	@Test
	public void login() throws Exception {

		ReadExcelData.readExcelData("Login");

		System.out.println(ReadExcelData.pojoClass.testCaseName);
		
		System.out.println(ReadExcelData.pojoClass.userName);

		System.out.println(ReadExcelData.pojoClass.password);
	}

}
