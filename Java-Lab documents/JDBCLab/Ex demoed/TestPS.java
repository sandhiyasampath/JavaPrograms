package com.uttara.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestPS {

	public static void main(String[] args) {
		
		String driverName = "org.hsqldb.jdbcDriver";
		String url = "jdbc:hsqldb:hsql://localhost/";
		String uid = "SA";
		String pwd = "";
		
		Connection con = null;
		PreparedStatement ps_ins = null, ps_sql = null;
		ResultSet rs = null;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		try
		{
			Class.forName(driverName);
			con = DriverManager.getConnection(url,uid,pwd);
			System.out.println("con = "+con);
			
			System.out.println("Enter name of villain");
			String name = sc2.nextLine();
			System.out.println("Enter traif of villain");
			String trait = sc2.nextLine();
			
			ps_ins = con.prepareStatement("insert into villains(name,trait) values(?,?)");
			ps_sql = con.prepareStatement("select * from villains");
			
			ps_ins.setString(1, name);
			ps_ins.setString(2, trait);
			
			ps_ins.execute();
			
			ps_sql.execute();
			rs = ps_sql.getResultSet();
			while(rs.next())
			{
				name = rs.getString("name");
				trait = rs.getString("trait");
				System.out.println("Name : "+name+" Trait : "+trait);
			}
			
			
			
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(rs!=null)
					rs.close();
				if(ps_ins !=null)
					ps_ins.close();
				if(ps_sql !=null)
					ps_sql.close();
				if(con!=null)
					con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		

	}

}
