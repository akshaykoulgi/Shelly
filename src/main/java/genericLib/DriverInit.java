package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {
	
	
	 public WebDriver driver;
	    private static DriverInit driverInit = null;

	    public static DriverInit getInstance() {
	        if (driverInit == null) {
	            driverInit = new DriverInit();
	        }
	        return driverInit;
	    }

	    private DriverInit() {
	        this.driver = new ChromeDriver();
	        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        this.driver.get("https://www.mumbaifilmfestival.com/");
	    }

	    public WebDriver getDriver() {
	        return this.driver;
	    }

}
