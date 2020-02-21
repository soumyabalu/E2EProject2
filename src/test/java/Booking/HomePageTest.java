package Booking;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.Bookingpage;
import pageobject.HomePage;
import Booking.Base;

public class HomePageTest extends Base {
public static  Logger log =LogManager.getLogger(HomePageTest.class.getName());
	@BeforeTest
	public void initializing() throws IOException {
		driver =initialization();
		log.info("driver succesfully initialized");
      	driver.get(prop.getProperty("url"));
      	log.info("succeffully got hit the url");
	}
	
	@Test
	public void homePagetest() throws IOException {
	
		HomePage hp = new HomePage(driver);
	  hp.fromCity().click();
      hp.cityName().click();
      hp.toCity().click();
      hp.startDate().click();
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
      Bookingpage bp = new Bookingpage(driver);
  	bp.nextpage().click();
      log.info("succefully loaded everything");
      }
	@AfterTest
	public void tearTest() {
		driver.close();
		driver = null;
	}
}
