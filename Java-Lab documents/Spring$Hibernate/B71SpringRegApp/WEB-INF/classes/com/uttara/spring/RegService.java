package com.uttara.spring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class RegService {
	
	public String register(UserBean bean)
	{
		Connection con = null;
		PreparedStatement ps_ins = null;
		//ResultSet rs = null;
		try
		{
			con = JDBCHelper.getConnection();
			if(con==null)
				return null;
			else
			{
				ps_ins = con.prepareStatement("insert into reg_users(name,email,pass,dob) values(?,?,?,?)");
				ps_ins.setString(1, bean.getUname());
				ps_ins.setString(2, bean.getEmail());
				ps_ins.setString(3, bean.getPass());
				ps_ins.setDate(4, new java.sql.Date(bean.getDob().getTime()));
				
				ps_ins.execute();
				
				return Constants.SUCCESS;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return "Unable to insert!! Msg is "+e.getMessage() ;
		}
		finally
		{
			JDBCHelper.close(ps_ins);
			JDBCHelper.close(con);
		}
	}
	
	public List<UserBean> fetchRegUsers()
	{
		List<UserBean> list = new ArrayList<UserBean>();
		
		/*
		 * get the connection to db
		 * execute the sql select
		 * loop over results
		 * 	per row instance and pop bean
		 * 	add bean to list
		 * endloop 
		 * return list
		 */
		Connection con = null;
		PreparedStatement ps_sql = null;
		ResultSet rs = null;
		try
		{
			con = JDBCHelper.getConnection();
			if(con==null)
				return null;
			else
			{
				ps_sql = con.prepareStatement("select * from reg_users");
				ps_sql.execute();
				
				rs = ps_sql.getResultSet();
				
				while(rs.next())
				{
					UserBean bean = new UserBean();
					bean.setUname(rs.getString("name"));
					bean.setEmail(rs.getString("email"));
					list.add(bean);
				}
				return list;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		finally
		{
			JDBCHelper.close(rs);
			JDBCHelper.close(ps_sql);
			JDBCHelper.close(con);
		}
		
	
	}

}
