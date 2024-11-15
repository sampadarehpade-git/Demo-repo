package GooglePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleImagesPage {
	WebDriver driver;

	public GoogleImagesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath ="//textarea[@aria-label='Search']//parent::div")
	private WebElement entertheValueinGoogleImageSearchBox ;

	@FindBy (xpath ="//span[@class='z1asCe MZy1Rb']//parent::div")
	private WebElement clickOnSearchButton ;
	
	@FindBy (xpath = "//img[@alt='Google Images']")
	private WebElement verifyGoogleImagePage ;
	
	public void enterValue(String text) {
		entertheValueinGoogleImageSearchBox.sendKeys(text);
	}
	
	public void clicksubmittbutton() {
		clickOnSearchButton.click();
	}
	public void verifypage() {
		verifyGoogleImagePage.isDisplayed();
		
	}
}

