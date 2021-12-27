package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractComponent {

	WebDriverWait wait;

	public AbstractComponent(WebDriver driver) {
		this.wait = new WebDriverWait(driver, 50);
		PageFactory.initElements(driver, this);
	}

	public abstract boolean isdisplayed();
}
