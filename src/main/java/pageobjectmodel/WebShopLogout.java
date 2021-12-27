package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebShopLogout extends AbstractComponent {

	public WebShopLogout(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	public WebElement logout;

	public void clickOnLogout() {
		this.logout.click();
	}

	public String getLogoutText() {
		return logout.getText();
	}

	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.logout));
		return this.logout.isDisplayed();
	}

}
