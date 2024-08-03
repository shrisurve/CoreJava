package durgaMultiThreading;

public class ThreadLocalDemo1A 
{
	public static void main(String[]args)
	{
		ThreadLocal tl=new ThreadLocal()
		{
			public Object initialValue()
			{
				return "abc";
			}
		};
		System.out.println(tl.get());
		tl.set("Durga");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());
	}
}
