package Array;

public class Rotation 
{
	public static void main(String[]args)
	{
		int a[]= {9,4,5,2,7,8,1};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		
		int temp=a[0];
		for(int i=1;i<a.length;i++)
		{
			a[i-1]=a[i];
		}
		
		
		
		
		a[a.length-1]=temp;
		System.out.println(" ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
