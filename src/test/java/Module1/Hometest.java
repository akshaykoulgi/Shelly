package Module1;


import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.HomePage;
import ObjectRepository.MyProfilePage;
import genericLib.BaseClass;

public class Hometest extends BaseClass {
	
	
	@Test
	public void loginTest() throws IOException, InterruptedException {
		
		
		System.out.println("Test annotation exeecuted. After login, before logout");
		
		
	}
	
	

	
	@Test
	public void editdetails() throws Throwable {
		HomePage hp = new HomePage(driver);
		MyProfilePage mp = new MyProfilePage(driver);

		//Test to verify the edited city of residence is as expected or not.
		String city= "Dharwad";
		//After Login, click on HI Profile_name
		hp.getHibtn().click();
		
		//Mouse hover to My Profile and click on My profile.
		
		wb.mousehoverTo(driver,hp.getMyProfileBtn() );
		
		hp.getMyProfileBtn().click();
		
		//My profile page is displayed,Click on  Edit Profile.
		
		wb.waitforELementContainsText(driver, "Edit", mp.getEditprofile());
		
		mp.getEditprofile().click();
		
		//Select City of residence and change the cityName.
		
		mp.getCityofResidenceTextBox().clear();
		mp.getCityofResidenceTextBox().sendKeys(city);
		
		mp.getSaveBtn().click();
		
		String actualcity = mp.getCityOfRes().getText();
		
		//Verifying using assert.
		Assert.assertEquals(actualcity, city);
		
			
		

}

	
}