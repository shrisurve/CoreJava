package durgaMultiThreading;
import java.util.concurrent.locks.*;
import java.util.concurrent.*;
class myThreadR3 extends Thread
{
	static ReentrantLock l=new ReentrantLock();
	myThreadR3(String name)
	{
		super(name);
	}
	public void run()
	{
		do
		{
			try
			{
				if(l.tryLock(5000,TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName()+"...got lock");
					Thread.sleep(30000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+"...Releases lock");
					break;
				}
				else
				{
					System.out.println(Thread.currentThread().getName()+"....unable to get lock "
							+ "and will try again");
				}
			}
			catch(Exception e)
			{
				
			}
		}while(true);
	}
}
public class reentrantLockDemo4 
{
	public static void main(String[]args)
	{
		myThreadR3 t1=new myThreadR3("First Thread");
		myThreadR3 t2=new myThreadR3("Second Thread");
		t1.start();
		t2.start();
	}
}
