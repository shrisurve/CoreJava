/*Synchronized Block:- If very few lines of the code required synchronization. Enclose those few lines of the 
the cade using synchronized block */ 
package durgaMultiThreading;

class Deisplay
{
	public void wish(String name)
	{
		;;;;;// 1 lakh lines of the code
		synchronized(this)
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
		;;;;;;// 1 lakh lines of the code
	}
}
class myThread17 extends Thread
{
	Display d;
	String name;
	myThread17(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}


public class threadSynchDemo4 
{
	public static void main(String[]args)
	{
		Display d=new Display();
		myThread17 t1=new myThread17(d,"Dhoni");
		myThread17 t2=new myThread17(d,"YouRaj");
		t1.start();
		t2.start();
	}
}
