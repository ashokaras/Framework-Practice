package tests;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import utilities.Executor;

public class TC002_ButtonFeature extends Executor {
	@Test
	public void Button_Validation() {
		HomePage home = new HomePage(driver);
		
		if(home.btn_Button.isDisplayed()) {
			reportPass("Home screen is displayed");
			home.btn_Button.click();
			reportPass("Button button is clicked from the home page");
		}else {
			reportFail("Home screen is not displayed and Button button is not clicked");
		}

		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}