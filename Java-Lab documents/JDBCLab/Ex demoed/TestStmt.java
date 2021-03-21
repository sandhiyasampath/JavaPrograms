package com.uttara.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestStmt {

	public static void main(String[] args) {
		
		String url = "jdbc:hsqldb:hsql://localhost/";
		String uid = "SA";
		String pwd = "";
		String driveName = "org.hsqldb.jdbcDriver";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		try
		{
			Class.forName(driveName);
			con = DriverManager.getConnection(url,uid,pwd);
			System.out.println("connection established!! con = "+con);
			
			System.out.println("Enter villain name");
			String name = sc2.nextLine();
			System.out.println("Enter trait of villain");
			String trait = sc2.nextLine();
			
			String insSql = "insert into villains(name,trait) values('"+name+"','"+trait+"')";
			System.out.println("insSql = "+insSql);
			
			stmt = con.createStatement();
			
			int num = stmt.executeUpdate(insSql);
			System.out.println("num of rows affected = "+num);
			
			String sql = "select * from villains order by name asc";
			rs = stmt.executeQuery(sql);
			
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
				try {
					if(rs!=null)
						rs.close();
					if(stmt!=null)
						stmt.close();
					if(con!=null)
						con.close();
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
		
	}
}
