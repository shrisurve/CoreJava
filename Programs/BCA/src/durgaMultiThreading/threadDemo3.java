//overriding of start method
package durgaMultiThreading;

class myThread2 extends Thread
{
	public void start()
	{
		super.start();    //this line is another concept
		System.out.println("Start Method");
	}
	public void run()
	{
		System.out.println("run method");
	}
}
public class threadDemo3 
{
	public static void main(String[]args)
	{
		myThread2 t=new myThread2();
		t.start();
		System.out.println("main method");
	}
}
