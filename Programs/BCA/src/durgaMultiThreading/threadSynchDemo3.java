/*class level lock:- if a thread wants to execute a static synchronized method. then thread 
required class level lock;*/
package durgaMultiThreading;

class Display2
{
	public synchronized void displayn()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
	public synchronized void displayc()
	{
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			
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
class myThread15 extends Thread
{
	Display2 d;
	myThread15(Display2 d)
	{
		this.d=d;
	}
	public void run()
	{
		d.displayn();
	}
	
}
class myThread16 extends Thread
{
	Display2 d;
	myThread16(Display2 d)
	{
		this.d=d;
	}
	public void run()
	{
		d.displayc();
	}
}
public class threadSynchDemo3 
{
	public static void main(String[]args)
	{
		Display2 d1=new Display2();
		myThread15 t1=new myThread15(d1);
		myThread16 t2=new myThread16(d1);
		t1.start();
		t2.start();
		
	}

}
