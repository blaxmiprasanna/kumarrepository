package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.w3c.dom.views.AbstractView;

public class Books extends AbstractComponent{

	public Books(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@type='submit']//following::a[1]")
	public WebElement books;
	
	public void clickBooksLink(){
		books.click();
	}

	@Override
	public boolean isdisplayed() {
		this.wait.until(ExpectedConditions.visibilityOf(this.books));
		return this.books.isDisplayed();
	}

}
