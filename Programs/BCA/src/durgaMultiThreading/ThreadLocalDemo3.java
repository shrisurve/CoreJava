package durgaMultiThreading;

class parentThread extends Thread
{
	public static InheritableThreadLocal tl=new InheritableThreadLocal()
			{
		       public Object childValue(Object p)
		       {
		    	   return "cc";
		       }
			};
			
			public void run()
			{
				tl.set("pp");
				System.out.println("Parent Thread value--"+tl.get());
				
				childThread ct=new childThread();
				ct.start();
			}
}
class childThread extends Thread
{
	public void run()
	{
		System.out.println("Child Thread value---"+parentThread.tl.get());
	}
}
public class ThreadLocalDemo3 
{
	public static void main(String[] args)
	{
		parentThread pt=new parentThread();
		pt.start();
	}
}
