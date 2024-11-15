package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GoogleUtility {
	WebDriver driver;



	public static void takeScreenshot(WebDriver driver, String scname) {
		java.io.File  srcFile = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new java.io.File("./TestStepsScreenshots/"+scname+".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void WaitForTime(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}
	public static void VerifyingTitleOfThePage(WebDriver  driver) {
		
	}
}













































