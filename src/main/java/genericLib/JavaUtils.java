package genericLib;

import java.util.Date;

public class JavaUtils {

	
public static String getDateandTime() {
	
	
	Date d = new Date();
	String date = d.toString().replace(" ", "_").replace(":", "_");
	return date;

}	
	
}
