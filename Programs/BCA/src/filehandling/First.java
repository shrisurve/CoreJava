package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class First 
{
	public static void main(String[] args) 
	{
		try(FileInputStream f=new FileInputStream("C:/MYJava1/Demo.txt"))
		{
			 byte b[]=new byte[f.available()];
			 f.read(b);
			 String s=new String(b);
			 System.out.println(s);
			 f.close();
			 
			 FileOutputStream f2=new FileOutputStream( "‪C:/Users/HP/Desktop/FileH/Demo7.txt");
			 f2.write(b);
			 f2.close();
			 
			 
			 
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
