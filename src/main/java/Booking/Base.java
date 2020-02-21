package Booking;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public static WebDriver driver;
	public Properties prop;
	
	public  WebDriver initialization() throws IOException {
		
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("src/test/resources/data.properties");
	    prop.load(fis);
	    if(prop.getProperty("browser").equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\soumya balu\\workspace\\New folder\\chromedriver_win32\\chromedriver.exe");
	            driver = new ChromeDriver();
	    }
	
	    else if(prop.getProperty("browser").equals("firefox")) {
	    	System.setProperty("webdriver.gecko.driver","C:\\Users\\soumya balu\\workspace\\New folder\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	           driver = new FirefoxDriver();
	    
	    }
	    
	    else {
	    	System.setProperty("webdriver.ie.driver", "C:\\Users\\soumya balu\\workspace\\New folder\\IEDriverServer_x64_3.150.1\\IEDriverServer.exe");
	       driver = new InternetExplorerDriver();
	    }
	     
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
	}

}
