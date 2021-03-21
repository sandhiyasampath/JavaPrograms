package com.uttara.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConn {

	public static void main(String[] args) {
		
		String url = "jdbc:hsqldb:hsql://localhost/";
		String uid = "SA";
		String pwd = "";
		String driveName = "org.hsqldb.jdbcDriver";
		
		Connection con = null;
		try
		{
			Class.forName(driveName);
			con = DriverManager.getConnection(url,uid,pwd);
			System.out.println("connection established!! con = "+con);
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}
}
