package keyword.base;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	
	public WebDriver driver;
	
	public Properties prop;
	
	
	public WebDriver init_driver(String browsername) {
		if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver = new ChromeDriver();
		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--remote-allow-origins=*"); ChromeDriver driver = new
		 * ChromeDriver(options);
		 */
			
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 */
			
			
		}	
		
		return driver;
	}

	
	public Properties init_properties() throws IOException {
		
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("G:\\cucumber\\KeywordDriven\\src\\main\\java\\keyword\\config\\config.properties");
		
		//FileReader fs = new FileReader(System.getProperty("user.dir"+"\\KeywordDriven\\src\\main\\java\\keyword\\config\\config.properties"));
		prop.load(fis);
		
		return prop;
		
		
	}
	
	public void loadUrl() {
		driver.get("https://the-internet.herokuapp.com/login");
				
	}
	
	public void sendusername() {
		driver.findElement(By.id("username")).sendKeys("tomsmith ");	
	}
	
	public void sendpassword() {
		
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

		
	}
	
	public void clickonLogin() {
		driver.findElement(By.xpath("//*[@class='fa fa-2x fa-sign-in']")).click();

		
		
	}
	
	public void closebrowser() {
		
		driver.quit();

	}
	
}
