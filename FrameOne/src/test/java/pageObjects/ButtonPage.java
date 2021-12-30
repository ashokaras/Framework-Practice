package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage {
	
	WebDriver driver;
	
	public ButtonPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}

}