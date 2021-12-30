package utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Executor extends Reporter {
	
	public WebDriver driver;
	int i=1;
	
	@BeforeTest
	public void reportStart() {
		startReports();
	}
	
	@BeforeClass
	public void openApp() throws IOException {
		System.out.println("Inside before class");
		i++;
		startApp();
	}
	
	@AfterClass
	public void closeApp() {
		quitApp();
	}
	
	@AfterTest
	public void reportEnd() {
		extent.flush();
	}
	
	public void startApp() throws IOException {
		createTestCase("TC"+i);
		WebDriverManager.chromedriver().setup();
		//System.out.println("Inside start app method");
		//System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.leafground.com/");
	}

	public void quitApp() {
		driver.quit();
	}

}