package Exam;
public class UserDefined extends Exception
{
	String str;
	public UserDefined(String s)
	{
		str=s;
	}
	public String toString()
	{
		return "Invalid String";
	}
}
