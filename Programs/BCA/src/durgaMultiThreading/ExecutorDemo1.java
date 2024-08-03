package durgaMultiThreading;
//Thread pool
import java.util.concurrent.*;
class printJob implements Runnable
{
	String name;
	printJob(String name)
	{
		this.name=name;
	}
	public void run()
	{
		System.out.println(name+"...Job Started by Thread: "+Thread.currentThread().getName());
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println(name+"...Job completed by Thread: "+Thread.currentThread().getName());
	}
}
public class ExecutorDemo1 
{
	public static void main(String[] args)
	{
		printJob[] jobs= { new printJob("Durga"),new printJob("Ravi"),new printJob("Shiva"),new printJob("Pavan"),
				new printJob("Suresh"),new printJob("Anil")
		};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(printJob job:jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}
}
