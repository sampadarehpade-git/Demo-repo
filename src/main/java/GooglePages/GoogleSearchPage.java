package GooglePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
	 WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath ="//a[contains(text(),'Images')]")
	private WebElement ClickOnImagesLink ;

	public void ClickImage() {
		ClickOnImagesLink.click();
	}



}