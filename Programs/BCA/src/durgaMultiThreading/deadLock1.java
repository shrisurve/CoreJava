//if two threads are waiting for each other

package durgaMultiThreading;

class A
{
	public synchronized void d1(B b)
	{
		System.out.println("Thread 1 start Execution of d1() method");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread 1 trying to call B's last() method");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside A, this is last() method");
	}
}
class B
{
	public synchronized void d2(A a)
	{
		System.out.println("Thread 2 starts execution of d2() method");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread 2 trying to call A's last() method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B, this is last() method");
	}
}
public class deadLock1 extends Thread
{
	A a=new A();
	B b=new B();
	public void m1()
	{
		this.start();
		a.d1(b);
	}
	public void run()
	{
		b.d2(a);
	}
	public static void main(String[]args)
	{
		deadLock1 d=new deadLock1();
		d.m1();
	}
}
