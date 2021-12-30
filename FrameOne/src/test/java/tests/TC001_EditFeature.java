package tests;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import utilities.Executor;

public class TC001_EditFeature extends Executor {
	@Test
	public void Edit_Validation() {
		HomePage home = new HomePage(driver);
		
		if(home.btn_Edit.isDisplayed()) {
			reportPass("Home screen is displayed");
			home.btn_Edit.click();
			reportPass("Edit button is clicked from the home page");
		}else {
			reportFail("Home screen is not displayed and edit button is not clicked");
		}

		
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}