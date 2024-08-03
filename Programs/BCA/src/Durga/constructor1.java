package Durga;

public class constructor1 
{
	static int count=0;
	{
		count++;
	}
	constructor1()
	{
		System.out.println("Non-Prametarised Constructor");
	}
	constructor1(int i)
	{
		System.out.println("Integral Constructor: "+i);
	}
	constructor1(double d)
	{
		System.out.println("Double Constructor: "+d);
	}
	public static void main(String[]args)
	{
		constructor1 c1=new constructor1();
		constructor1 c2=new constructor1(10);
		constructor1 c3=new constructor1(10.5);
		
		System.out.println("The Number of Object Created is: "+count);
	}
	
}
