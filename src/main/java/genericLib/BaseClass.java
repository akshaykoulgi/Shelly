package genericLib;



import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;


public class BaseClass {
	public FileUtility fis = new FileUtility();
	public DataBaseUtils dbu = new DataBaseUtils();
	public WebDriverUtils wb = new WebDriverUtils();
	public static WebDriver driver;
	

	
	// @BeforeSuite
	  public void beforeSuite() throws SQLException {
	 System.out.println("To configure and connect to the database."); 
	dbu.connectToDB(); 
	 
	 
	 }
	 
	 
      @BeforeClass
	  public void beforeClass() throws IOException, InterruptedException {
    	  System.out.println("Launching the browser ");
  		System.out.println(new File(".").getAbsolutePath());

    	  String url = "https://www.mumbaifilmfestival.com/";
    	 String browser = fis.getkeyvalue("browser");
    	  System.setProperty("webdriver.chrome.driver", "F:\\ECLIPSE\\chromedriver.exe");
    	  if(browser.equals("chrome")) {
    		  
    		  driver = new ChromeDriver();
    		  
    	  }
    	  
    	  else if(browser.equals("firefox")) {
    		  driver = new FirefoxDriver();
    	  }
    	  
		 // staticDriver=driver;

    	  //wb.waitImplicit(driver);
    	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	  driver.get(url);
    	  
	  }

  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  
	  LoginPage lp = new LoginPage(driver);
	  HomePage hp = new HomePage(driver);
	  hp.getUserLoginbtn().click();
	  hp.getLoginbtn().click();
	  
	  lp.LogintoApp("akshay.koulgi@gmail.com", "20172018akar2");
	  
	  
  }

  
  @AfterMethod
  public void afterMethod() {
	  //Logout
	  
	  HomePage hp = new HomePage(driver);
	  hp.logoutfromApp(driver);
	  
  }

  
  @AfterClass
  public void afterClass() {
	  
	  
	  driver.close();
  }

 

  @AfterSuite
  public void afterSuite() {
  }

 
}
