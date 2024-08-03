package jdbc;

import java.sql.*;

public class First 
{
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
		}
		catch(Exception e)
		{
			System.out.println("unable to load");
			
		}
	}
	public static void main(String[] args) 
	{
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian","root","root"))
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
					
				
	}

}
