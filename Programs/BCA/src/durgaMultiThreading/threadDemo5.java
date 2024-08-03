//durg's approach to define a thread
package durgaMultiThreading;

class myThread3 extends Thread
{
	public void run()
	{
		System.out.println("child thread");
	}
}
public class threadDemo5 
{
	public static void main(String[]args)
	{
		myThread3 t=new myThread3();
		Thread t1=new Thread(t);
		t1.start();
		System.out.println("main thread");
	}
}
