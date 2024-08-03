package Durga;
//Overloaded Constructors
public class constructor2 
{
	constructor2()
	{
		this(10);
		System.out.println("no-arg");
	}
	constructor2(int i)
	{
		this(10.5);
		System.out.println("int-arg");
	}
	constructor2(double d)
	{
		System.out.println("double-arg");
	}
	public static void main(String[]args)
	{
		constructor2 c1=new constructor2();
		System.out.println("\n");
		
		constructor2 c2=new constructor2(10);
		System.out.println("\n");
		
		constructor2 c3=new constructor2(10.5);
	}
}
