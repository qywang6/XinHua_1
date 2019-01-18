package CRUDtest;

import java.sql.Connection;
import java.sql.DriverManager;

public class DubtilTest {
	static String url="jdbc:mysql://localhost:3306/xinhua";
	static String driver="com.mysql.jdbc.Driver";
	static String user="root";
	static String pwd="root";
	public static Connection getConnection(){
		try{
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url, user, pwd);
			return conn;
		}catch(Exception e){
			
		}
		return null;
		
		
	}
}
