package Array;

public class MaximumElement 
{
	public static void main(String[]args)
	{
		int []a = {5,4,3,2,9,8,4};
		int max = a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			}
	}
		System.out.println("Maximum Element: "+max);
		
	}
}
