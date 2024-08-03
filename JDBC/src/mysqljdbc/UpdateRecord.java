package mysqljdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
public class UpdateRecord 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ResultSet rs=null;
		PreparedStatement ps=null;
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian","root","root");Statement st=con.createStatement())
		{
			
			System.out.println("Enter Name Of The Student To Update The Id");
			String name=sc.nextLine();
			System.out.println("Enter The New ID for student");
			int newId=sc.nextInt();	
			ps=con.prepareStatement("UPDATE student SET id=? WHERE name=?");
			ps.setInt(1, newId);
			ps.setString(2, name);
			int a=ps.executeUpdate();
			System.out.println(a>0?"Data Updated Successfully":"Data Can not be updated");
			rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println("Name: "+rs.getString(2)+" Roll Number:"+rs.getInt(1)+" Address:"+rs.getString(3));
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
