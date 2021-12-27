package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.CTS.sampleproject.HelperClass;


public class Password extends AbstractComponent {

	public Password(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "Password")
	public WebElement password;

	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.password));
		return this.password.isDisplayed();
	}

	public void enterPassword() throws Exception {
		password.sendKeys(HelperClass.getPropertyFileData().getPassword());
	}
}
