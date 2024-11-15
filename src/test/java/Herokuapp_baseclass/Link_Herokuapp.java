package Herokuapp_baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Link_Herokuapp {
 protected static WebDriver driver;
	@BeforeTest
	public static void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void linktext() {
		driver.get("https://signup.heroku.com/dc");
	}
	@Test
	public void username() throws InterruptedException {
		WebElement user = driver.findElement(By.xpath("//input[@id='first_name']"));
		user.sendKeys("surya");
//		Thread.sleep(30000);
//		String expt ="surya";
//		String act= user.getText();
//		Assert.assertEquals(act, expt);	
	}
	@Test
	 public void lastname() throws InterruptedException {
		WebElement Lastname = driver.findElement(By.xpath("//input[@id='last_name']"));
		Lastname.sendKeys("mathur");
//		Thread.sleep(30000);
//		String expt ="mathur";
//		String Act = Lastname.getText();
//		Assert.assertEquals(Act, expt);
	}

	
}
