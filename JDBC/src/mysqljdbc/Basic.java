package mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Basic 
{
	
	public static void main(String[] args) 
	{
		Connection con=null;
		ResultSet rs=null;
		Statement st=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian","root","root");
			st=con.createStatement();
			rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"  "+rs.getString(3));
				
			}
		}
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}
}
