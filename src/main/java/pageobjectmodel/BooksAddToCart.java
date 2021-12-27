package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BooksAddToCart extends AbstractComponent {

	public BooksAddToCart(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//strong[contains(text(),'Filter by price')]//following::input[1]")
	public WebElement addToCart;

	public void clickOnAddToCart() {
		addToCart.click();
	}

	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.addToCart));
		return this.addToCart.isDisplayed();
	}

}
