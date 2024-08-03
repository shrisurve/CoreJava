package durgaMultiThreading;
import java.util.concurrent.locks.*;
class DisplayR1
{
	ReentrantLock l=new ReentrantLock();
	public void wish(String name)
	{
		l.lock();
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
		l.unlock();
	}
}
class myThreadR1 extends Thread
{
	DisplayR1 d;
	String name;
	myThreadR1(DisplayR1 d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}

public class reentrantLockDemo2 
{
	public static void main(String[]args)
	{
		DisplayR1 d=new DisplayR1();
		myThreadR1 t1=new myThreadR1(d,"Dhoni");
		myThreadR1 t2=new myThreadR1(d,"YouRaj");
		myThreadR1 t3=new myThreadR1(d,"Kohli");
		t1.start();
		t2.start();
		t3.start();
		
	}
}
