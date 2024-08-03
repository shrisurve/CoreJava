package mysqljdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdateDelete
{
    static
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Successfully");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args)
    {

        try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/asian","root","root"); Statement st=con.createStatement())
        {
            int value=st.executeUpdate("DELETE from student WHERE id=5");
            System.out.println(value);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}