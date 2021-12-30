package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObjectBase {
	
	WebDriver driver;
	
	@FindBy (xpath="//div[@class='row']/ul/li[1]") public WebElement btn_Edit;
	@FindBy (xpath="//div[@class='row']/ul/li[2]") public WebElement btn_Button;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);		
	}

}