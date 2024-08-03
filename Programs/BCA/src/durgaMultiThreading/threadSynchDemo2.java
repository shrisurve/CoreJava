//if multiple threads are operating on on multiple java objects then Synchronization is not required
//we will get irregular output
package durgaMultiThreading;

class Display1
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Good Morning: ");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println(name);
		}
	}
}
class myThread14 extends Thread
{
	Display1 d;
	String name;
	myThread14(Display1 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class threadSynchDemo2 
{
	public static void main(String[]args)
	{
		Display1 d1=new Display1();
		Display1 d2=new Display1();
		
		myThread14 t1=new myThread14(d1,"Dhini");
		myThread14 t2=new myThread14(d2,"YouRaj");
		t1.start();
		t2.start();
	}
}
