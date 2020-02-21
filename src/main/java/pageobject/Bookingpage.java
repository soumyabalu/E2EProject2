package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookingpage {
	WebDriver driver;
	public Bookingpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

 @FindBy(xpath="//span[@class='forward-icon']")
 WebElement Continue;
 
 
 public WebElement nextpage() {
	 return Continue;
 }
 
 
 
 
 
 
 
 
}


