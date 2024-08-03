//package jdbc;
//import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
//public class JdbcDemo1 
//{
//	public static void main(String[] args)
//	{
//		Connection c=null;
//		Statement stmt=null;
//		
//		try
//		{
//			class.forName(com.mysql.cj.jdbc.Driver);
//			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian","root","root")
//					stmt=c.createStatement();
//			String sql="CREATE TABLE Employee"+"(ID INT PRIMARY KEY NOT NULL),"+
//					"NAME TEXT NOT NULL,"+"AGE INT NOT NULL,"+"ADDRESS CHAR(50),"+
//					"SALARY REAL)";
//			stmt.executeUpdate(sql);
//			stmt.close();
//			c.close();
//		}
//		catch(Exception e)
//		{
//			System.err.println(e.getClass().getName()+": "+e.getMessage());
//			System.exit(0);
//		}
//		System.out.println("Table Created Successfully");
//	}
//}
