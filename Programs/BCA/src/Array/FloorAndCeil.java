package Array;

public class FloorAndCeil 
{
	public static int floor(int []arr,int num)
	{
		int floor=0;
		for(int x:arr)
		{
			if(x<=num && x>floor)  //f=15
			{
				floor=x;
			}
		}
		return floor;
	}
	public static int ceil(int []arr,int num)
	{
		int ceil=Integer.MAX_VALUE;
		for(int x:arr)
		{
			if(x>=num && x<ceil)  //ceil=18
			{
				ceil=x;
			}
		}
		return ceil;
	}
	public static void main(String[]args)
	{
		int []arr= {15,6,8,19,16,11,10,18};
		System.out.println(floor(arr,12));
		System.out.println(ceil(arr,12));
	}
}
