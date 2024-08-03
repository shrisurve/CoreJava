package durgaMultiThreading;

class myThread19 extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("child thread start calculation");
			for(int i=1;i<=100;i++)
			{
				total=total+i;
			}
			System.out.println("child thread trying to give notification");
			this.notify();
		}
	}
}
public class interThreadCommu2 
{
	public static void main(String[]args)throws Exception
	{
		myThread19 t=new myThread19();
		t.start();
		Thread.sleep(10000);
		synchronized(t)
		{
			System.out.println("main thread trying to call wait()method");
			t.wait(10000);
			System.out.println("main thread got notification");
			System.out.println(t.total);
		}
	}
}
