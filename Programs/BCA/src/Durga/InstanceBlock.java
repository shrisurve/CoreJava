package Durga;
//Instance Block Control Flow
public class InstanceBlock 
{
	int i=10;
	{
		m1();
		System.out.println("Parent Instance Block");
	}
	InstanceBlock()
	{
		System.out.println("Parent Constructor");
	}
	public static void main(String[]args)
	{
		InstanceBlock I=new InstanceBlock();
		System.out.println("Parent Main Method");
	}
	public void m1()
	{
		System.out.println(j);
	}
	int j=20;
}
class Child extends InstanceBlock
{
	int x=100;
	{
		m2();
		System.out.println("Child First Instance Block");
	}
	Child()
	{
		System.out.println("Child Constructor");
	}
	public static void main(String[]args)
	{
		Child c=new Child();
		System.out.println("Child Main Method");
		
	}
	public void m2()
	{
		System.out.println(y);
	}
	{
		System.out.println("Child Seconds Instance Block");
	}
	int y=200;
}
