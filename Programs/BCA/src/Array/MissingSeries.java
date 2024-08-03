package Array;

public class MissingSeries
{
	public static int missingFibonacci(int []arr,int start,int end)
	{
		int []ans=new int[arr.length+1];
		int n1=0,n2=1,index=0,n3;
		while(index<ans.length)
		{
			n3=n1+n2;
			ans[index++]=n1;
			n1=n2;
			n2=n3;
		}
		for(int i=0;i<ans.length-1;i++)
		{
			if(arr[i]!=ans[i])
			{
				return ans[i];
			}
		}
		return 0;
	}
	public static void main(String[]args)
	{
		int []arr= {0,1,1,2,3,5,8,13,34,55};
		
		System.out.println(missingFibonacci(arr,0,55));
	}
}
