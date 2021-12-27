package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class UpdateCart extends AbstractComponent{

	public UpdateCart(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@name='updatecart']")
	public WebElement updateCart;
	
	public void clickUpdateCart(){
		this.updateCart.click();
	}

	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.updateCart));
		return this.updateCart.isDisplayed();
	}

}
