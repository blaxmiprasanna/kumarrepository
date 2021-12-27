package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class Email extends AbstractComponent {

	public Email(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "Email")
	public WebElement email;

	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.email));
		return this.email.isDisplayed();
	}

	public void enterEmail() throws Exception {
		email.sendKeys(com.CTS.sampleproject.HelperClass.getPropertyFileData().getUsername());
	}
}
