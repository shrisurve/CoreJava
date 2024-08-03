//define thread by implementing Runnable Interface
package durgaMultiThreading;

class myRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}
}
public class threadDemo4 
{
	public static void main(String[]args)
	{
		myRunnable r=new myRunnable();
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}
