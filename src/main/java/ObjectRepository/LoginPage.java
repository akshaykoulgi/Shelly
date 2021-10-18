package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);	
	}
	
	@FindBy(id = "UserLogin_username")
	private WebElement username;
	
	@FindBy(id="UserLogin_password")
	private WebElement password;
	
	@FindBy(id="submit_button")
	private WebElement loginbtn;
	
	

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	
	// Business methods
	public void LogintoApp(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
		
	}
	
	
	

}
