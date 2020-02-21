

package stepDefinitions;



import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pageobject.Bookingpage;
import pageobject.HomePage;

import org.junit.runner.RunWith;
import org.testng.Assert;

import Booking.Base;

@RunWith(Cucumber.class)

public class StepDefinition extends Base {

	@Given("^initialize chrome$")
	public void initialize_chromeDriver() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver = initialization();
	}

	@Given("^the user hit the \"([^\"]*)\" website$")
	public void the_user_hit_the_website(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("http://www.spicejet.com");
	}

	@When("^the user finish performing  all the actions$")
	public void the_user_finish_performing_all_the_actions() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		HomePage hp = new HomePage(driver);
		Assert.assertTrue(hp.oneWay().isSelected());
		hp.fromCity().click();
	      hp.cityName().click();
	      hp.toCity().click();
	      hp.startDate().click();
	      Assert.assertFalse(hp.roundTrip().isSelected());
	      hp.passengers().click();
	      hp.adult().click();
	      hp.adultNum().click();
	      hp.child().click();
	      hp.childNum().click();
	      hp.infant().click();
	      hp.infantNum().click();
	      hp.currency().click();
	      hp.currencyName().click();
	      hp.search().click();
	}

	
	@Then("^verify the navigation$")
	public void verify_the_navigation() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 Bookingpage bp = new Bookingpage(driver);
		  	bp.nextpage().click();
		  	System.out.println("the page is succesfully navigated");
		  	
	}





	}