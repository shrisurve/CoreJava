package OOPS;

public class Constructor 
{
	{
		System.out.println("FRom Non Static Block");
	}
	
	static{
		System.out.println("From  Static Block");
	}
	public Constructor() {
		// TODO Auto-generated constructor stub
		System.out.println("From Default Constructor");
	}
	public static void main(String[] args) 
	{
		Constructor c1=new Constructor();
	}
}
