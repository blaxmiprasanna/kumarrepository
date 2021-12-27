package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmptyMessage extends AbstractComponent{

	public EmptyMessage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains(text(),'Your Shopping Cart is empty!')]")
	public WebElement shoppingCartIsEmpty;
	
	public String getShoppingCartIsEmpty(){
		return this.shoppingCartIsEmpty.getText();
	}
	
	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.shoppingCartIsEmpty));
		return this.shoppingCartIsEmpty.isDisplayed();
	}

}
