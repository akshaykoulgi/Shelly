package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.WebDriverUtils;

public class HomePage extends WebDriverUtils {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//div[@id='mami-navbar']/ul/li/a/h5[.='Home']")
	private WebElement homebtn;
	
	@FindBy(xpath="//li[@class='dropdown']")
	private WebElement userLoginbtn;
	
	
	@FindBy(xpath="//a[@href='/user/login']")
	private WebElement loginbtn;
	


	@FindBy(xpath="//a[@class='dropdown-toggle']/h5/span[@class='text-capitalize']")
	private WebElement hibtn;
	
	
	@FindBy(xpath="//a[@href='/user/logout']")
	private WebElement logout;

	
	@FindBy(xpath="//a[@href='/user/profile']")
	private WebElement MyProfileBtn;


	public WebElement getMyProfileBtn() {
		return MyProfileBtn;
	}


	public WebElement getHomebtn() {
		return homebtn;
	}


	public WebElement getHibtn() {
		return hibtn;
	}


	public WebElement getLogout() {
		return logout;
	}
	
	public WebElement getUserLoginbtn() {
		return userLoginbtn;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public void logoutfromApp(WebDriver driver) {
		
		
		homebtn.click();
		hibtn.click();
		
		
		waitforELementContainsText(driver, "LOGOUT", logout);
		mousehoverTo(driver, logout);
		logout.click();
		
		
		
	}
	
	
	
	
	
}