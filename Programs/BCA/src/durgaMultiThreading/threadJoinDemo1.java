//join() Method program:- thread wants to waiting until completing some other threads 
package durgaMultiThreading;

class myThread9 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Seetha thread");
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
public class threadJoinDemo1 
{
	public static void main(String[]args)throws InterruptedException
	{
		myThread9 t=new myThread9();
		t.start();
		t.join(10000);
		for(int i=0;i<10;i++)
		{
			System.out.println("Rama thread");
		}
	}
}
