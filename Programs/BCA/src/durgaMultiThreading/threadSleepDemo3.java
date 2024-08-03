//if target thread not in sleeping state then there is no impact on interrupted call immediately
package durgaMultiThreading;

class myThread12 extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("I am Lazy Thread-"+i);
		}
		System.out.println("I am Entering into sleeping state");
		
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			System.out.println("I got Interrupted");
		}
	}
}
public class threadSleepDemo3 
{
	public static void main(String[]args)
	{
		myThread12 t=new myThread12();
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
	}
}
