package Array;

public class SecondLargestElement 
{
	public static void main(String[]args)
	{
		int []a = {45,30,15,76,90,12};
		int max1,max2;
		max1=max2=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max1)
			{
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2)
			{
				max2=a[i];
			}
		}
		System.out.println("Maximum Elements is: "+max1);
		System.out.println("Second Largest Number is: "+max2);
	}
}
