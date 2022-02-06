package testcasefolder;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CTS.sampleproject.BaseClass;
import com.CTS.sampleproject.ValidateItemInCart;

public class CheckOutTheITemFromShoppingCart extends BaseClass {
	
	WebDriver driver;
	ValidateItemInCart validateItem;
	
	@BeforeMethod
	public void startUp() throws Exception{
		try {
			driver = setUp();
			entercredentials();
			validateItem = new ValidateItemInCart(driver);
			Assert.assertEquals(validateItem.webShopLogout.getLogoutText(), "Log out");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void checkOutTheITemFromShoppingCart(){
		
		
		
		
	}

	@AfterMethod()
	public void tearDown() throws InterruptedException{
		Thread.sleep(9000);
		teardown();
	}

	
}
