package ValidateGoogleImagesPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import GooglePages.GoogleImagesPage;
import GooglePages.GoogleSearchPage;
import Utility.GoogleUtility;

public class ImagesTest  {

	WebDriver driver;
	GoogleSearchPage  googleSearchPage ;
	GoogleImagesPage googleImagesoPage= new GoogleImagesPage(driver);

	@BeforeClass
	public void openBrowser(){
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");	
		GoogleUtility.takeScreenshot(driver, "Googlepagescreenshot");


	}

	@Test(priority = 1)
	public void  TC01_ClcikImages() {
		googleSearchPage = new GoogleSearchPage(driver) ;
		googleSearchPage.ClickImage();
		GoogleUtility.takeScreenshot(driver, "Googleimagesscreenshot");

	}
	@Test(priority = 2)
	public void TC02_verifyImagepage() {
		GoogleUtility.WaitForTime(5000);
		googleImagesoPage.verifypage();
	}
	@Test(enabled = false)
	public void TC03_SearchTextAndClick() {

		
		GoogleUtility.WaitForTime(5000);
		googleImagesoPage.enterValue("java programing");
		GoogleUtility.WaitForTime(5000);
		GoogleUtility.takeScreenshot(driver, " entered the value screenshot");
		googleImagesoPage.clicksubmittbutton();
		GoogleUtility.takeScreenshot(driver, " clicked button screenshot");

	}

	@AfterMethod
	public void takesFailedScereenshotTasteCase(ITestResult result) throws IOException, InterruptedException {
		if(ITestResult.FAILURE==result.getStatus()) {
			GoogleUtility.takeScreenshot(driver, result.getName());
		}
		

	}

}
