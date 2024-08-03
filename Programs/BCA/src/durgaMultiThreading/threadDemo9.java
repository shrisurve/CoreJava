//Thread priority 
package durgaMultiThreading;

class myThread7 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}
}
public class threadDemo9 
{
	public static void main(String[]args)
	{
		myThread7 t=new myThread7();
		t.setPriority(7);
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}
}
