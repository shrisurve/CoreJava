//Thread Priority 
package durgaMultiThreading;

class myThread6 extends Thread
{
	
}
public class threadDemo8 
{
	public static void main(String[]args)
	{
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(15);
		Thread.currentThread().setPriority(7);
		myThread6 t=new myThread6();
		System.out.println(t.getPriority());
	}
}
