package com.uttara.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StudentCRUDJDBCApp {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		int ch=0;
		
		Connection con = null;
		PreparedStatement psStu_ins = null, psMarks_ins = null, psStuSel = null;
		ResultSet rs = null;
		
		try
		{
			con = JDBCHelper.getConnection();
			if(con==null)
			{
				System.out.println("Oops theres been a problem establishing connection. Contact Admin! If you are admin, go to temple!");
				return;
			}
			
			con.setAutoCommit(false);
			
			psStu_ins = con.prepareStatement("insert into students(name,id,dob) values(?,?,?)",Statement.RETURN_GENERATED_KEYS);
			psMarks_ins = con.prepareStatement("insert into student_marks(student_sl,std,marks) values(?,?,?)");
			psStuSel = con.prepareStatement("select * from students");
			String name,id,stds,marks,sdob;
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			while(ch!=3)
			{
				System.out.println("Press 1 to add student info");
				System.out.println("Press 2 to retrieve student info");
				System.out.println("Press 3 to exit");
				ch = sc1.nextInt();
				switch(ch)
				{
					case 1:
							System.out.println("adding...");
							System.out.println("Enter name of student");
							name = sc2.nextLine();
							System.out.println("Enter id of student");
							id = sc2.nextLine();
							System.out.println("Enter dob (dd/mm/yyyy) of student");
							sdob = sc2.nextLine();
							System.out.println("Enter stds (comma separated)");
							stds = sc2.nextLine();
							System.out.println("Enter marks (comma separated)");
							marks = sc2.nextLine();
							java.util.Date dt = sdf.parse(sdob);
							java.sql.Date sdt = new java.sql.Date(dt.getTime());
							
							psStu_ins.setString(1, name);
							psStu_ins.setString(2,id);
							psStu_ins.setDate(3, sdt);
							
							psStu_ins.execute();
							
							rs = psStu_ins.getGeneratedKeys();
							rs.next();
							int sl = rs.getInt("sl_no");
							System.out.println("generated sl = "+sl);
							
							String[] stdarr = stds.split(",");
							String[] marksarr = marks.split(",");
							for(int i = 0 ; i < stdarr.length ; i++)
							{
								psMarks_ins.setInt(1, sl);
								psMarks_ins.setString(2, stdarr[i]);
								psMarks_ins.setInt(3, Integer.parseInt(marksarr[i]));
								psMarks_ins.execute();
							}
							con.commit();
							
							
							break;
					case 2:
						System.out.println("retrieving...");
						psStuSel.execute();
						rs = psStuSel.getResultSet();
						while(rs.next())
						{
							System.out.println("Name : "+rs.getString("name")+" ID : "+rs.getString("id")+" Dob : "+rs.getDate("dob"));
							
						}
						break;
	
					case 3:
						System.out.println("tata bye bye...");
						break;
						
				}
			}
		
		}
		catch(Exception e)
		{
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		finally
		{
			
			JDBCHelper.close(rs);
			JDBCHelper.close(psMarks_ins);
			JDBCHelper.close(psStu_ins);
			JDBCHelper.close(psStuSel);
			JDBCHelper.close(con);
			
		}
		

	}

}
