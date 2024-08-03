package Durga;
//both static and instance block control flow
public class StaticInstance
{
	{
		System.out.println("First Instance Block");
	}
	static
	{
		System.out.println("First Static Block");
	}
	StaticInstance()
	{
		System.out.println("Constructor");
	}
	public static void main(String[]args)
	{
		StaticInstance si=new StaticInstance();
		System.out.println("Main Method");
		StaticInstance si2=new StaticInstance();
	}
	static
	{
		System.out.println("Second Static Block");
	}
	{
		System.out.println("Second Instance Block");
	}
}
