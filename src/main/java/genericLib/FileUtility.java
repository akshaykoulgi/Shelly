package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getkeyvalue(String key) throws IOException{
		
		FileInputStream fis = new FileInputStream(Iconstants.propertyfilepath);
		Properties pr = new Properties();
		pr.load(fis);
		String value =  pr.getProperty(key);
		return value;
		
	}
	
	

}
