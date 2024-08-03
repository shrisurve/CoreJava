//how to thread communicate each other program 
package durgaMultiThreading;

class myThread18 extends Thread
{
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Child thread starts calculation");
			for(int i=1;i<=100;i++)
			{
				total=total+i;
			}
			System.out.println("child thread trying to give notification");
			this.notify();
		}
	}
}
public class interThreadCommu1 
{
	public static void main(String[]args)throws Exception
	{
		myThread18 t=new myThread18();
		t.start();
		synchronized(t)
		{
			System.out.println("Main Thread trying to call wait()method");
			t.wait();
			System.out.println("Main thread got notification");
			System.out.println(t.total);
		}
	}
}