package TestCasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import groovyjarjarantlr.collections.List;

public class Loginpage_wid_pagefact {
	WebDriver driver;
	  
	//constructor??
	 
	public Loginpage_wid_pagefact(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//locator 
	@FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input") WebElement user_name;
	@FindBy(xpath = "//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")WebElement pwd;
	@FindBy(xpath = "//button[@type = 'submit']")WebElement button;
	@FindBy (tagName = "a") List links;


	
	// ActionMethod
	 
	 public void setname(String user) {
		 user_name.sendKeys(user);
	 }
	 public void setpassword(String pass) {
		 pwd.sendKeys(pass);
		 
	 }
	 public void loginbtn () {
		 button.click();
	 }
	
	
	
	
	
	
	
	
}
