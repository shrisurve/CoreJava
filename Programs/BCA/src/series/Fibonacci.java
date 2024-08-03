package series;

public class Fibonacci 
{
	public static void fibonacci(int n)
	{
		int count=0;
		int n1=0;
		int n2=1;
		int n3;
		
		while(true)
		{
			n3=n1+n2;
			System.out.println(n1+" ");
			n1=n2;
			n2=n3;
			
			if(count==n)
			{
				break;
			}
			++count;
		}
	}
}
