package com.infinite.login.chatbotweb;
import java.io.*;
import java.sql.*;
import java.util.Date;

import javax.servlet.*;

import com.infinite.dao.chatbotweb.DBConnection;
public class RegServlet extends GenericServlet{
	
	public void service (ServletRequest req, ServletResponse res)
		throws ServletException ,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		String uName = req.getParameter("name");
		String password = req.getParameter("password");
		String fName = req.getParameter("firstname");
		String lName = req.getParameter("lastname");
		long phNumber = Long.parseLong(req.getParameter("phonenumber"));
		String mailId = req.getParameter("mailid");
		
		try (Connection con = DBConnection.connect()){
			if(con != null){
			PreparedStatement ps = con.prepareStatement
					("insert into regBot values(?,?,?,?,?,?)");
			
			ps.setString(1, uName);
			ps.setString(2, password);
			ps.setString(3, fName);
			ps.setString(4, lName);
			ps.setLong(5, phNumber);
			ps.setString(6, mailId);
			int k= ps.executeUpdate();
			if (k==1)
			{
				pw.println("User Registered Successfully");
				RequestDispatcher rd =
						req.getRequestDispatcher("Login.html");
				rd.include(req , res);
			}//end of if
			
		}else
		{
			File file = new File("C:\\Users\\pruthweerajp\\pr", "login.txt");
			//creating a file name as login.txt
			PrintWriter printWriter = new PrintWriter(file);
			
			printWriter.println("userName="+uName);
			printWriter.println("password="+password);
			printWriter.println("fName="+fName);
			printWriter.println("lName="+lName);
			printWriter.println("phNumber="+phNumber);
			printWriter.println("mailId="+mailId);
			
			//writing all the details in the file and then printing resistation successful
			printWriter.println("updated successfully"+new Date().toString());
			printWriter.flush();
			printWriter.close();
			
			
			//redirecting to the login page
		System.out.println("done...");
		
		}
			
	}//end of try
    catch (Exception e) {e.printStackTrace();}		
	}

}
