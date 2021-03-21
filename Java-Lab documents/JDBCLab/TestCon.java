import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestCon {

	public static void main(String[] args) {
		
		String driverName = "org.hsqldb.jdbcDriver";
		String URL = "jdbc:hsqldb:hsql://localhost/";
		String UID = "SA";
		String PWD = "";
		
		//ctrl + shift + o
		
		Connection con = null;
		PreparedStatement ps_ins = null;
		PreparedStatement ps_ins2 = null;
		PreparedStatement ps_sql = null;
		ResultSet rs = null;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		String name;
		double price;
		String sdt;
		String ingri;
		try
		{
			//1. Load the driver
			Class.forName(driverName);
			
			//2. Ask DriverManager to establish conn
			con = DriverManager.getConnection(URL,UID,PWD);
			
			System.out.println("established con = "+con);
			
			System.out.println("Enter name of food");
			
			name = sc2.nextLine();
			System.out.println("Enter price of food");
			
			price = sc1.nextDouble();
		
			System.out.println("Enter ingridents(comma seperated)");
			ingri = sc2.nextLine();
			
			ps_sql = con.prepareStatement("select * from food, food_ingridents where food.sl_no = food_ingridents.food_sl");
			
			ps_ins = con.prepareStatement("insert into food(name,price) values(?,?)",Statement.RETURN_GENERATED_KEYS);
			ps_ins.setString(1, name);
			ps_ins.setDouble(2, price);
			
			ps_ins.execute();
			
			rs = ps_ins.getGeneratedKeys();
			rs.next();
			
			int sl = rs.getInt(1);
			
			String[] ents = ingri.split(",");
			ps_ins2 = con.prepareStatement("insert into food_ingridents(food_sl,iname) values(?,?)");
			for(String s : ents)
			{
				ps_ins2.setInt(1, sl);
				ps_ins2.setString(2,s);
				ps_ins2.execute();
			}
			
			ps_sql.execute();
			rs = ps_sql.getResultSet();
			
			while(rs.next())
			{
				name = rs.getString("name");
				price = rs.getDouble("price");
				ingri = rs.getString("iname");
				
				System.out.println("Name : "+name+" Price : "+price+" Ingri : "+ingri);
				
			}
			
			
			System.out.println("done!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			JDBCHelper.close(rs);
			JDBCHelper.close(ps_sql);
			JDBCHelper.close(ps_ins);
			JDBCHelper.close(ps_ins2);
			JDBCHelper.close(con);
			
		}
	}

}
