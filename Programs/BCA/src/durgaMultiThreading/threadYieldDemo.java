//yield() Method program:- pause current executing thread to give the chance waiting threads
package durgaMultiThreading;

class myThread8 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
			Thread.yield();
		}
	}
}
public class threadYieldDemo 
{
	public static void main(String[]args)
	{
		myThread8 t=new myThread8();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}
