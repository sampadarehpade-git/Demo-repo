package GoogleBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

 public class  Base{
	WebDriver driver;
	
	@BeforeClass
	public void openBrowser(){
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");	
	}
	
	@AfterClass
	public void CloseBrower() {
		driver.close();
		driver.quit();

	}
}