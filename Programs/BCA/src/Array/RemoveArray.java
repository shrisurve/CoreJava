package Array;

import java.util.Arrays;

public class RemoveArray 
{
	public static int []remove(int []arr, int index)
	{
		if(index>=0 && index<=arr.length)
		{
			int []ans=new int[arr.length-1];
			for(int i=0,j=0;i<arr.length;i++)
			{
				if(i!=index)
				{
					ans[j++]=arr[i];
				}
			}
			return ans;
		}
		return null;
	}
	
	public static int []remove(int element, int []arr)
	{
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
				index=i;
			}
		}
		if(index!=-1)
		{
			int []ans=new int[arr.length-1];
			for(int i=0,j=0;i<arr.length;i++)
			{
				if(i!=index)
				{
					ans[j++]=arr[i];
				}
			}
			return ans;
		}
		return null;
	}
	public static void main(String[]args)
	{
		int []arr= {8,7,9,3,5,8,6,9,6,3,1};
		int []ans=remove(arr,9);
		
		System.out.println(Arrays.toString(ans));
	}
}
