//overloading of run() method
package durgaMultiThreading;

class myThread1 extends Thread
{
	public void run()     
	{
		System.out.println("no-arg run method");
	}
	public void run(int i)
	{
		System.out.println("int-arg run method");
	}
}
public class threadDemo2 
{
	public static void main(String[]args)
	{
		myThread1 t=new myThread1();
		t.start();
	}
}
