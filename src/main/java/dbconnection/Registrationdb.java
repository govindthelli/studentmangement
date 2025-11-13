package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Registrationdb {
	
	private static String Driver="com.mysql.cj.jdbc.Driver";
	private static String url="jdbc:mysql://db:3306/student";
	private static String username="govind";
	private static String password="govind123";
	private static Connection conn=null;
	public static Connection getconn()
	{
		try {
			Class.forName(Driver);
			conn=DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
