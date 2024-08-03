//How a Thread can Interrupt another Thread
package durgaMultiThreading;

class myThread11 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("I am Lazy Thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("I got interrupted");
		}
	}
}
public class threadSleepDemo2 
{
	public static void main(String[]args)
	{
		myThread11 t=new myThread11();
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");
	}
}
