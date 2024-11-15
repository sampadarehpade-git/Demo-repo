package Baseclass_OrngHrm;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestCasePage.Login_OrngHrmPage;
import TestCasePage.Loginpage_wid_pagefact;

public class LoginTestOrngHrm {
	WebDriver driver;
	 @BeforeClass
	  public void setup() {
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		   
	 }
	 
	  @Test
	  public void testlogin() {
		  Loginpage_wid_pagefact lp = new Loginpage_wid_pagefact(driver);
		  lp.setname("Admin");
		  lp.setpassword("admin123");
		  lp.loginbtn();
		  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		  
	  }
	   @AfterClass
	   public void teardown() {
		   if (driver != null)
		   driver.quit();
		   
	   }


}