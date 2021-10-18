package genericLib;

import java.sql.*;
public class DataBaseUtils {

Connection con= null ;	
	public void connectToDB() throws SQLException {
		
		Driver driver = null;
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		
	}
	
	public void closeDb() throws SQLException {
		
		con.close();
		
		
	}
	
	
	public ResultSet executeQuery(String query) throws SQLException {
		
		ResultSet res = con.createStatement().executeQuery(query);
		
		return res;
		
	}
	
	
	
	
}
