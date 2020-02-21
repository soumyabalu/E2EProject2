package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	 WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ctl00_mainContent_rbtnl_Trip_0")
	WebElement OneWay;
	
	@FindBy(id="ctl00_mainContent_view_date2")
	WebElement RoundTrip;
	
	@FindBy(id="ctl00_mainContent_ddl_originStation1_CTXT")
	WebElement FromCity;
	
	@FindBy(xpath="//a[@value='MAA']")
	WebElement FromCityName;
	
	@FindBy(xpath = "//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='KQH']")
	WebElement ToCity;
	
	@FindBy(css =".ui-state-default.ui-state-highlight.ui-state-active")
	WebElement StartDate;
    
	@FindBy(id ="divpaxinfo")
     WebElement Passengers;
	
	@FindBy(id="ctl00_mainContent_ddl_Adult")
	WebElement Adult;
	
	@FindBy(xpath="//select[@id='ctl00_mainContent_ddl_Adult']/option[2]")
	WebElement AdultNum;
	
	@FindBy(id="ctl00_mainContent_ddl_Child")
	WebElement Child;
	
	@FindBy(xpath="//select[@id='ctl00_mainContent_ddl_Child']/option[2]")
	WebElement ChildNum;
	
	@FindBy(id="ctl00_mainContent_ddl_Infant")
	WebElement Infant;
	
	@FindBy(xpath="//select[@id='ctl00_mainContent_ddl_Infant']/option[2]")
	WebElement InfantNum;
	
	@FindBy(id="ctl00_mainContent_DropDownListCurrency")
	WebElement Currency;
	
	@FindBy(xpath="//select[@id='ctl00_mainContent_DropDownListCurrency']/option[3]")
	WebElement CurrencyName;
	
	@FindBy(id="ctl00_mainContent_btn_FindFlights")
	WebElement Search;
	
	public WebElement oneWay() {
		return OneWay;
	}
	
	public WebElement roundTrip() {
		return RoundTrip;
	}
	
	public WebElement fromCity() {
		return FromCity;
	}
	public WebElement cityName() {
		return FromCityName;
	}
	
	public WebElement toCity() {
		return ToCity;
	}
	
	public WebElement startDate(){
		return StartDate;
	}
	
	public WebElement passengers() {
		return Passengers;
	}
	public WebElement adult() {
		return Adult;
	}
	
	public WebElement adultNum() {
		return AdultNum;
	}
	
	public WebElement child() {
		return Child;
	}
	
	public WebElement childNum() {
		return ChildNum;
	}
	
	public WebElement infant() {
		return Infant;
	}
	
	public WebElement infantNum() {
		return InfantNum;
	}
	
	public WebElement currency() {
	    return Currency;
    }
	
	public WebElement currencyName() {
		return CurrencyName;
	}
	
	public WebElement search() {
		return Search;
	}
}
