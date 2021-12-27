package com.CTS.sampleproject;

import org.testng.annotations.Test;

public class AccountSummary {
	
	@Test
	public void accountSummary() throws Exception {
		
		ReadExcelData.readExcelData("AccountSummary");
		
		System.out.println(ReadExcelData.pojoClass.testCaseName);

		System.out.println(ReadExcelData.pojoClass.userName);

		System.out.println(ReadExcelData.pojoClass.password);
		
		System.out.println(ReadExcelData.pojoClass.nreAccount);

		System.out.println(ReadExcelData.pojoClass.nroAccount);
		
		System.out.println(ReadExcelData.pojoClass.routine);
		

	}

}
