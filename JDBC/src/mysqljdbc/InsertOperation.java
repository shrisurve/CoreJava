package mysqljdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class InsertOperation 
{
	static
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully");
		}
		catch (Exception e) 
		{
			System.out.println("Unable To Load Driver");
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		PreparedStatement ps=null;
		Statement st=null;
		ResultSet rs=null;
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian","root","root"))
		{	
			System.out.println("Enter How Many Records You Want To insert");
			int num=sc.nextInt();
			for(int i=0;i<num;i++)
			{
				ps=con.prepareStatement("insert into student values(?,?,?);");
				System.out.println("Enter Unique Roll Number");
				int rollNo=sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Student Name");
				String name=sc.nextLine();
				System.out.println("Enter Student Location");
				String location=sc.nextLine();
				ps.setInt(1, rollNo);
				ps.setString(2, name);
				ps.setString(3, location);
				int n=ps.executeUpdate();
				System.out.println(n>0?"Data Inserted Successfully":"Data Not Inserted");
			}
			ps.close();
			st=con.createStatement();
			rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println("Name: "+rs.getString(2)+" Roll No: "+rs.getInt(1)+" Location:"+rs.getString(3));
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);// TODO: handle exception
		}	
		
	}
}
