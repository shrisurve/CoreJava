//daemon thread:- Thread which are executing in the background
package durgaMultiThreading;

class myThread20 extends Thread
{
	
}
public class threadDaemon1
{
	public static void main(String[]args)
	{
		System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);
		myThread20 t=new myThread20();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		System.out.println(t.isDaemon());
	}
}
