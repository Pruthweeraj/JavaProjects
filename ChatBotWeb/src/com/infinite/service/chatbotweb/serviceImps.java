package com.infinite.service.chatbotweb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

import com.infinite.dao.chatbotweb.DBConnection;



public class serviceImps implements service {

	Connection con;
	int n = 1;
	String u1,u2,u3,b1,b2,b3;
	@Override
	public String getQuery(String msg) {
		
		con = DBConnection.connect();
		String query = "Select * from msg";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			String dMsg_u1 = rs.getString("u1");
			String dMsg_u2 = rs.getString("u2");
			String dMsg_u3 = rs.getString("u3");
			
			
			if((msg.equals(dMsg_u1)) || (msg.equals(dMsg_u2))  ||  (msg.equals(dMsg_u3)) ) {
				//System.out.println("going to if block");
				Random random = new Random();
				int randomValue = (int)(random.nextInt(3 - 1 + 1) + 1);
				System.out.println(randomValue);
				if (randomValue == 1) {
					return rs.getString("b1");
				}
				else if (randomValue == 2) {
					return rs.getString("b2");
				}
				else if (randomValue == 3) {
					return rs.getString("b3");
				}
				
			}
			//System.out.println("not going to if block");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		
		
		return null;
	}
	@Override
	public String addQuery(String[] databaseAddMsg) {
		for (String string : databaseAddMsg) {
			
			if (n== 1) {
				u1 = string;
				
			}
			if (n== 2) {
				u2 = string;
				
			}
			if (n== 3) {
				u3 = string;
				
			}
			if (n== 4) {
				b1 = string;
				
			}
			if (n== 5) {
				b2 = string;
				
			}
			if (n== 6) {
				b3 = string;
				n = 1;
				
			}
			n++;
			
		}
		con = DBConnection.connect();
		String query = "insert into msg (u1,u2,u3,b1,b2,b3) values  (?,?,?,?,?,?);";
		
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, u1);
			ps.setString(2, u2);
			ps.setString(3, u3);
			ps.setString(4, b1);
			ps.setString(5, b2);
			ps.setString(6, b3);
			int i = ps.executeUpdate();
			if(i != 0) {
			return "pass";
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				con.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		return "fail";
	}

}
