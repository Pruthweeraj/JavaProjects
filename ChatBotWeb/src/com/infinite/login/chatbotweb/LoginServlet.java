package com.infinite.login.chatbotweb;
import java.io.*; 
import java.sql.*;
import java.util.Properties;

import javax.servlet.*;

import com.infinite.dao.chatbotweb.DBConnection;
public class LoginServlet extends GenericServlet {
	
	public void service (ServletRequest req, ServletResponse res)
		throws ServletException , IOException
		{
			PrintWriter pw= res.getWriter();
			res.setContentType("text/html");
			
			String userName = req.getParameter("username");
			String password = req.getParameter("password");
			
	
			try (Connection con = DBConnection.connect()){
				if(con != null){
			PreparedStatement ps = con.prepareStatement
					("select * from regBot where USER_NAME=? and PASSWORD=? ");
			ps.setString(1, userName);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				pw.println("<lable style=\"color:red\">HI User </br> Login success..!!!</leble>");
				//RequestDispatcher rd =req.getRequestDispatcher("dis");
				RequestDispatcher rd =req.getRequestDispatcher("Messanger2.jsp");	
				rd.forward(req,res);
				
			}//end of if
			else
			{
				pw.println("<lable style=\"color:red\">Invalid UserName or Password  </br> Please try again..!!!</leble>");
				RequestDispatcher rd = req.getRequestDispatcher("Login.html");
				rd.include(req,res);
				
			}//end of else
			
		}else
		{
			//open the file name login.txt
			Properties  properties = new Properties();
			
			FileInputStream fileInputStream = null;
			try {
					fileInputStream = new FileInputStream("C:\\Users\\pruthweerajp\\pr\\login.txt");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			//loading the file to the properties object
			try {
				properties.load(fileInputStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//if exist then redirect the user to the Messanger2.jsp
			String fileUserName = properties.getProperty("userName");
			String filePassword = properties.getProperty("passWord");
			if(fileUserName.equals(userName) && filePassword.equals(password)){
				RequestDispatcher rd =req.getRequestDispatcher("Messanger2.jsp");	
				rd.forward(req,res);
					
			}
			
			
			//if not exist then reload the login page with a invalid credential message
			
			pw.println("<lable style=\"color:red\">Invalid UserName or Password  </br> Please try again..!!!</leble>");
			RequestDispatcher rd = req.getRequestDispatcher("Login.html");
			rd.include(req,res);
			
			
			
		}
	}//end of try
		
		catch (Exception e) {e.printStackTrace();}
		
		}//end of service
}
