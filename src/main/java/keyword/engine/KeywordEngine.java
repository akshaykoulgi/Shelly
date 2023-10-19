package keyword.engine;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import keyword.base.Base;

public class KeywordEngine extends Base{

	
	//public WebDriver driver;
	public Properties prop;
	
	public static Workbook book;
	public static org.apache.poi.ss.usermodel.Sheet sheet;
	
	public String locatorname=null;
	public String locatorvalue=null;
	Base bs;

	
	public final String keyword_sheet_path = "G:\\cucumber\\KeywordDriven\\src\\main\\java\\heroku\\excel\\keywords.xlsx";
	
	public void startExecution(String sheetname) throws EncryptedDocumentException, IOException, Exception {
		
		//To read the excel file we use FileInputStram class to first give the file as an imput to the java class file
		
			
		 FileInputStream fis = new FileInputStream(keyword_sheet_path);
			
		// Creates a workbook from the given Input stream of file.
		
		book = WorkbookFactory.create(fis);
		
		sheet =  book.getSheet(sheetname);
		
		// to iterate over the rows and columns we will use a loop
		int k=0;// k is for coloumn
		
		try {
		
		for(int i=0;i<sheet.getLastRowNum();i++) {
			
		
			
			// here we are getting the coloumn value of Locator column.
			
			
			String locator = sheet.getRow(i+1).getCell(k+1).getStringCellValue().toString().trim();
			//trim method removes all the blank spaces and given only the text value
			
			System.out.println("Locator variable "+locator);
		
		String action =  sheet.getRow(i+1).getCell(k+2).getStringCellValue().toString().trim();
		// Now we will use switch case to switch to different coloumn values of Action coloums , we will write the corresponding java selenium code

				switch (action) {
				case "open browser":
					
					 bs = new Base();
					//bs.init_properties();
					bs.init_driver("chrome");
					System.out.println("chrome opened");
					break;
					
				case "url":
					System.out.println("switched to url case");
					//driver.get("https://the-internet.herokuapp.com/login");
					bs.loadUrl();
					System.out.println("ENtered URL");
					break;
					
				case "sendkeys1":
					//driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
					bs.sendusername();
					break;
					
					
				case "sendkeys2":
					bs.sendpassword();
					//driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
					break;
					
					
				case "click":
					bs.clickonLogin();
					//driver.findElement(By.className("fa fa-2x fa-sign-in")).click();
					break;
					
					
				case "quit":
				System.out.println("closeing browser");
				bs.closebrowser();
				//driver.quit();
					
					break;

				default:
					break;
				}			// end of switch case
		
								
				System.out.println("end of for loop action value"+action);	


		}//end of for
		
		

			}// end of try 
catch(Exception e) {
			
			
		}

		} 
		
		
			
		}
		
		
	
	

/*if(!locator.equalsIgnoreCase("NA")) {
	
	String locatorname = locator.split("=")[0].trim();
	String locatorvalue = locator.split("=")[1].trim();
	*/
	/*
	 * switch (locatorname) {
	 * 
	 * case "id": System.out.println("switch to case id happening"); WebElement
	 * idele =driver.findElement(By.id(locatorvalue));
	 * 
	 * if(locatorvalue.equalsIgnoreCase("username")) {
	 * 
	 * idele.sendKeys(prop.getProperty("username"));
	 * 
	 * break; }
	 * 
	 * 
	 * if(locatorvalue.equalsIgnoreCase("password")) {
	 * 
	 * idele.sendKeys(prop.getProperty("password")); break;
	 * 
	 * }
	 * 
	 * case "NULL":
	 * 
	 * break;
	 * 
	 * case "NA": break;
	 * 
	 * case "class": WebElement classele =
	 * driver.findElement(By.className(locatorvalue)); classele.click(); break;
	 * 
	 * default: break;
	 * 
	 * } // end of switch
	 */
//}


	
	
	

