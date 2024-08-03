//thread sleep() method:- thread don't want to perform any operation for a particular amount of time
package durgaMultiThreading;

public class threadSleepDemo1 
{
	public static void main(String[]args) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Slide no-"+i);
			Thread.sleep(5000);
		}
	}

}
