package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCart extends AbstractComponent {

	public ShoppingCart(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
	public WebElement shoppingCart;

	public void clickShoppingCart() {
		shoppingCart.click();
	}

	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.shoppingCart));
		return this.shoppingCart.isDisplayed();
	}

}
