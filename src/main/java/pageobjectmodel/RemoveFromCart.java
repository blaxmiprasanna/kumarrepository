package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RemoveFromCart extends AbstractComponent{

	public RemoveFromCart(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='removefromcart']")
	public WebElement removeFromCartCheckbox;
	
	public void clickOnremoveFromCartCheckbox(){
		removeFromCartCheckbox.click();
	}

	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.removeFromCartCheckbox));
		return this.removeFromCartCheckbox.isDisplayed();
	}

}
