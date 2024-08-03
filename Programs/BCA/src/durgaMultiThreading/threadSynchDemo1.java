package durgaMultiThreading;

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0;i<10;i++)
		{
			System.out.print("Good Morning: ");
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
class myThread13 extends Thread
{
	Display d;
	String name;
	myThread13(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class threadSynchDemo1 
{
	public static void main(String[]args)
	{
		Display d=new Display();
		myThread13 t1=new myThread13(d,"Dhoni");
		myThread13 t2=new myThread13(d,"YouRaj");
		t1.start();
		t2.start();
	}
}
