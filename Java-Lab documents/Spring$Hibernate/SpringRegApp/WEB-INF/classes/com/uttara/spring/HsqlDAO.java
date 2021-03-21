package com.uttara.spring;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class HsqlDAO implements DAO {

	@Override
	public boolean insert(RegBean bean) {
		
		Connection con = null;
		PreparedStatement ps_ins = null;
		try
		{
			con = JDBCHelper.getConnection();
			ps_ins = con.prepareStatement("insert into register(name,email,dob,pass,pic) values(?,?,?,?,?) ");
			ps_ins.setString(1, bean.getUname());
			ps_ins.setString(2, bean.getEmail());
			ps_ins.setDate(3, new java.sql.Date(bean.getDob().getTime()));
			ps_ins.setString(4, bean.getPass());
			
			//FileInputStream fin = new FileInputStream(bean.getPic());
			
			//ps_ins.setBlob(5, x);
			ps_ins.execute();
			
			return true;
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return false;
		}
		finally
		{
			JDBCHelper.close(ps_ins);
			JDBCHelper.close(con);
		}
		
		
	}

	@Override
	public boolean update(String email, RegBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<RegBean> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegBean getUserInfo(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
