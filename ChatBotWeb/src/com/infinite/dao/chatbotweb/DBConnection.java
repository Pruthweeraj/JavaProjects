package com.infinite.dao.chatbotweb;
import java.sql.*;
public class DBConnection  {

	private static Connection con;
	private DBConnection() {}
	static String url = "jdbc:mysql://localhost:3306/bot";
	static String username = "root";
	static String password = "root";
	
	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection(url,username,password);
			 System.out.println("Database connected!");
		}//end of try
		
		catch(Exception e) {
			throw new IllegalStateException("Cannot connect the database!", e);
		}
	}//end of static block
	


	public static Connection connect() {
		return con;
	}

	
	public static void  close() {
		try {
			con.close();
		} catch (SQLException e) {
			throw new IllegalStateException("Unable to close the Database Connection...!!!", e);
		}
		
	}
	
	
	
}
