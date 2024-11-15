package Pages.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Herokuapp_baseclass.Link_Herokuapp;

public class Registration_page extends Link_Herokuapp{
	public Registration_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"first_name\"]")
	WebElement firstname;
	
	@FindBy(xpath = "//*[@id=\"last_name\"]")
	WebElement lastname;
	 
	@FindBy(xpath= "//*[@id=\"email\"]")
    WebElement Email;
	
	@FindBy(xpath="//*[@id=\"company\"]")
	WebElement Company;
	
	@FindBy(xpath = "//*[@id=\"role\"]")
	WebElement role;
	 
	
}
