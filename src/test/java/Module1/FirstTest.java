package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
		@Test
		public void contact() {
			
			System.setProperty("webDriver.chrome.driver", "/Shelly/chromedriver.exe");
		WebDriver driver = null;
		driver = new ChromeDriver();
		
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		System.out.println("just print this : Hello!");
		
		
	}

}
