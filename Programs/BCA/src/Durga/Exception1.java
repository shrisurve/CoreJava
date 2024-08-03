package Durga;

class TooYoungException extends RuntimeException 
{
	TooYoungException(String s)
	{
		super(s);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}
public class Exception1
{
	public static void main(String[] args)
	{
		int age=Integer.parseInt(args[0]);
		
		if(age >60)
		{
			throw new TooYoungException("Plz wait some more time.. You will get best matche soon");
		}
		else if(age<18)
		{
			throw new TooOldException("Your age is already crossed marriage age.. no chance of gettion marriage");
		}
		else
		{
			System.out.println("You will get match details soon by email...!");
		}
	}
}
