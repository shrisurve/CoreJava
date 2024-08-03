package durgaMultiThreading;

class myThread21 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
public class threadDaemon2 
{
	public static void main(String[]args)
	{
		myThread21 t=new myThread21();
		t.setDaemon(true);
		t.start();
		System.out.println("End of Main Thread");
	}
}
