package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.BaseClass;

public class MyProfilePage extends BaseClass {
	WebDriver driver;

	public MyProfilePage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath="//a[@href='/user/profile/edit']")
	private WebElement editprofile;
	
	
	@FindBy(id="Profile_firstname")
	private WebElement FirstNameTextBox;
	
	@FindBy(id="Profile_lastname")
	private WebElement LastNameTextBox;

	
	@FindBy(id="Profile_age")
	private WebElement AgeTextBox;
	

	@FindBy(id="Profile_contact_number")
	private WebElement ContactNumberTextBox;
	
	@FindBy(xpath="//table/tbody/tr[6]/td")
	private WebElement cityOfRes;
	
	@FindBy(id="Profile_city_of_residence")
	private WebElement CityofResidenceTextBox;
	
	@FindBy(id="User_username")
	private WebElement UserNameTextBox;
	
	@FindBy(id="User_email")
	private WebElement EmailTextBox;
	
	@FindBy(id="submit_button")
	private WebElement SaveBtn;
	
	
	
	
	public WebElement getEditprofile() {
		return editprofile;
	}

	public WebElement getFirstNameTextBox() {
		return FirstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return LastNameTextBox;
	}

	public WebElement getAgeTextBox() {
		return AgeTextBox;
	}

	public WebElement getContactNumberTextBox() {
		return ContactNumberTextBox;
	}

	public WebElement getCityOfRes() {
		return cityOfRes;
	}

	public WebElement getCityofResidenceTextBox() {
		return CityofResidenceTextBox;
	}

	public WebElement getUserNameTextBox() {
		return UserNameTextBox;
	}

	public WebElement getEmailTextBox() {
		return EmailTextBox;
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}
	
	
}
