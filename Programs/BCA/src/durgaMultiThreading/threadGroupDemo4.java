package durgaMultiThreading;

public class threadGroupDemo4 
{
	public static void main(String[]args)
	{
		ThreadGroup System= Thread.currentThread().getThreadGroup().getParent();
		Thread[] t=new Thread[System.activeCount()];
		System.enumerate(t);
		
		for(Thread t1:t)
		{
			//System.out.println(t1.getName()+"........"+t1.isDaemon());
		}
	}
}
