package Array;

public class insertArray 
{
	public static void main(String[]args)
	{
		int []a=new int[10];
		a[0]=5;
		a[1]=6;
		a[2]=7;
		a[3]=4;
		a[4]=9;
		a[5]=8;
		
		int n=6;
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		
		int x=20;
		int index=3;
		
		for(int i=n-1;i>index;i--)
		{
			a[i]=a[i-1];
		}
		a[index]=x;
		
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}
