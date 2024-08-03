package durgaMultiThreading;
import java.util.concurrent.locks.*;
class myThreadR2 extends Thread
{
	static ReentrantLock l=new ReentrantLock();
	myThreadR2(String name)
	{
		super(name);
	}
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+"....got lock and performing "
					+ "safe operations");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
			l.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+"...unable to get lock and hence "
					+ "performing alternative operations");
		}
	}
}
public class reentrantLockDemo3 
{
	public static void main(String[]args)
	{
		myThreadR2 t1=new myThreadR2("First Thread");
		myThreadR2 t2=new myThreadR2("Second Thread");
		t1.start();
		t2.start();
	}
}
