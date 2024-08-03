package Exam;
import java.io.*;

public class InvalidString 
{
	public static void main(String[]args)throws UserDefined
	{
		String s="Shrikant";
		
		try
		{
			if(s.length()<7)
			{
				throw new UserDefined(s);
			}
			else
			{
				System.out.println(s.toUpperCase());
			}
				
		}
		catch(UserDefined e)
		{
			System.out.println(e);
		}
	}
}
