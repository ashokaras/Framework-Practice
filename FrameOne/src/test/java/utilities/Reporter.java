package utilities;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporter {
	
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void startReports() {
		spark = new ExtentSparkReporter("output\\results.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}
	
	public void createTestCase(String testName) {
		test = extent.createTest(testName);
	}
	
	public void reportStep(String stepDescription) {
		test.info(stepDescription);
	}
	
	public void reportPass(String stepDescription) {
		test.pass(stepDescription);
	}
	
	public void reportFail(String stepDescription) {
		test.fail(stepDescription);
	}
	
	public void captureScreenshot() {
		try {
			Robot r = new Robot();
			Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle rect = new Rectangle(d);
			BufferedImage src = r.createScreenCapture(rect);
			String date = dateForScreenshotName();
			String fileName = date;
			File img = new File(""+fileName);
			ImageIO.write(src, "png", img);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String dateForScreenshotName() {
		
		return null;
	}

}
