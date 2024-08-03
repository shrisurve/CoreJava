//join() Method():- waiting of child thread until completing main thread
package durgaMultiThreading;

class myThread10 extends Thread 
{
	static Thread mt;
	public void run()
	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e)
		{
			
		}
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}
}
public class threadJoinDemo2 
{
	public static void main(String[]args)throws InterruptedException
	{
		myThread10.mt=Thread.currentThread();
		myThread10 t=new myThread10();
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
			Thread.sleep(2000);
		}
	}

}
