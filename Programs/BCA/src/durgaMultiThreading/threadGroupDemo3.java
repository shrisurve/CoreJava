package durgaMultiThreading;
//imp program
class myThread22 extends Thread
{
	myThread22(ThreadGroup g, String name)
	{
		super(g,name);
	}
	public void run()
	{
		System.out.println("Child Thread");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
public class threadGroupDemo3 
{
	public static void main(String[]args)throws Exception
	{
		ThreadGroup pg=new ThreadGroup("Parent Group");
		ThreadGroup cg=new ThreadGroup(pg,"Child Group");
		myThread22 t1=new myThread22(pg,"Child Thread1");
		myThread22 t2=new myThread22(pg,"Child Thread2");
		t1.start();
		t2.start();
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
		Thread.sleep(10000);
		System.out.println(pg.activeCount());
		System.out.println(pg.activeGroupCount());
		pg.list();
	}
}
