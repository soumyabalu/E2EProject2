package Booking;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.HomePage;

public class RndTripValidationTest extends Base{
	
	public static Logger log = LogManager.getLogger(RndTripValidationTest.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
	driver =initialization();
	log.info("driver succesfully initialized");
	driver.get(prop.getProperty("url"));
  	log.info("succeffully got hit the url");
  	
	}
	
	@Test
	public void validatingButton() {
		HomePage hp = new HomePage(driver);
		
		Assert.assertFalse(hp.roundTrip().isSelected());
		log.info("Test was successful");
	}
	
	@AfterTest
	public void tearTest() {
		driver.close();
		driver=null;
	}
	
	
	
	
	
	
}
