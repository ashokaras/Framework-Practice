package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EditPage {
	
	WebDriver driver;
	
	public EditPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}

}