package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginButton extends AbstractComponent {

	public LoginButton(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[contains(@value,'Log in')]")
	public WebElement loginsubmitbutton;

	public void clickLoginButton() {
		loginsubmitbutton.click();
	}

	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.loginsubmitbutton));
		return this.loginsubmitbutton.isDisplayed();
	}

}
