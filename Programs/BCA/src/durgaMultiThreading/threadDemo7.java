//we can get current execution thread object by using TCM method
package durgaMultiThreading;

class myThread5 extends Thread
{
	public void run()
	{
		System.out.println("Run Method executed by: "+Thread.currentThread().getName());
	}
}
public class threadDemo7 
{
	public static void main(String[]args)
	{
		myThread5 t=new myThread5();
		t.start();
		System.out.println("Main Method executed by: "+Thread.currentThread().getName());
	}
}
