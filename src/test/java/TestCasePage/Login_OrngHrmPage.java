package TestCasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login_OrngHrmPage {
	WebDriver driver;
	//constructor 
	public Login_OrngHrmPage (WebDriver driver){
		this.driver = driver;
		
			
	}
	 
//locaters
By text_username_loc = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input");
By text_password_loc = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input");
By btn_login_loc = By.xpath("//button[@type = 'submit']");
	

 // Action method 
public void username(String user){
	driver.findElement(text_username_loc).sendKeys(user);
	
}
public void setpassword(String pass) {
	driver.findElement(text_password_loc).sendKeys(pass);
}
 public void login() {
	 driver.findElement(btn_login_loc).click();
 }
}
