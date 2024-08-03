//Getting and Setting name of Thread
package durgaMultiThreading;

class myThread4 extends Thread
{
	
}
public class threadDemo6 
{
	public static void main(String[]args)
	{
		System.out.println(Thread.currentThread().getName());
		
		myThread4 t=new myThread4();
		System.out.println(t.getName());
		
		Thread.currentThread().setName("pawan kalyan");
		System.out.println(Thread.currentThread().getName());
	}
}
