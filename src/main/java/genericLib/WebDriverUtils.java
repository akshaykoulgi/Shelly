  package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * 
 * @author Akshay
 *
 */



/**
 
 The following code is for selecting a dropdown in 3 ways.
 1)Select by Visible Text.
  2)Select by Index.
 3)Select by Select by value of dropdown
 
 */
public class WebDriverUtils {

	public void select(WebElement ele,String visibletext) {
		Select sl = new Select(ele);
		sl.selectByVisibleText(visibletext);
		
	}
	
	
	public void select(WebElement ele2,int index)
	{
		Select s2 = new Select(ele2);
		s2.selectByIndex(index);
				
	}
	
	public void select(String Value,WebElement ele3) {
		
		Select s3 = new Select(ele3);
		s3.selectByValue(Value);
		
	}
	
	/*
	 *The following methods are used to wait explicitly.  	
	 */
	
	
	public void waitforElementtobeCLickable(WebDriver driver,WebElement ele) {
		
		WebDriverWait wait = new WebDriverWait(driver,Iconstants.ExplicitWait);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
		
	}
	
	public void waitforElementtobeVisible(WebDriver driver,WebElement ele1) {
		WebDriverWait wait = new WebDriverWait(driver,Iconstants.ExplicitWait);
		wait.until(ExpectedConditions.visibilityOf(ele1));	
		
		
	}

public void waitforELementContainsText(WebDriver driver,String text,WebElement ele) {
	
	WebDriverWait wait = new WebDriverWait(driver,Iconstants.ExplicitWait);
	wait.until(ExpectedConditions.textToBePresentInElement(ele, text));
	
}

/*
 * The following methods are used for implicit wait. 
 */

public void waitImplicit(WebDriver driver) {
	
	driver.manage().timeouts().implicitlyWait(Iconstants.ImplicitWait, TimeUnit.SECONDS); 

}


/*
 * Used to switch to different window handle, takes string as a parameter to compare the present window
 * title to the give title and switches if the string matches and breaks after finding the text.
 * 
 */
public void switchtoWindow(WebDriver driver,String partialStringTitle) {
	
Set<String> set = driver.getWindowHandles();
 Iterator<String> it = set.iterator();
	
	
	
	while(it.hasNext()) {
		
		
		String windid =  it.next();
		driver.switchTo().window(windid);
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(partialStringTitle)) {
			
		System.out.println("Switchced to actual window");	
			
			break;
		}
		
	}
	
	
}

public void alertaccept(WebDriver driver) {
	
	driver.switchTo().alert().accept();
	
}

public void alertdismiss(WebDriver driver) {
	
driver.switchTo().alert().dismiss();	
	
}


public void mousehoverTo(WebDriver driver,WebElement ele) {
	
Actions act = new Actions(driver);
act.moveToElement(ele).perform();
	
}

public void switchtoframes(WebDriver driver,int index) {
	
	driver.switchTo().frame(index);
	
	
}


public void switchtoframes(WebDriver driver,WebElement ele) {
	
	driver.switchTo().frame(ele);
		
}

public void switchtoframes(WebDriver driver,String name) {
	
	driver.switchTo().frame(name);
	
}

public void takeScreenShot(WebDriver driver) throws IOException {
	
TakesScreenshot ts = (TakesScreenshot)driver;	
File Filesc = ts.getScreenshotAs(OutputType.FILE);
String scr_path =System.getProperty("users.dir")+"/screenshot/"+JavaUtils.getDateandTime()+".png";
File dst = new File(scr_path);
Files.copy(Filesc, dst);
}


	
	
}
