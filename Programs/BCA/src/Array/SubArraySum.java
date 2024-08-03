package Array;

public class SubArraySum 
{
	public static void subarray(int []arr,int sum)
	{
		for(int i=0;i<arr.length;i++)
		{
			int checkSum=arr[i];
			if(checkSum==sum)
			{
				System.out.println("Sum found At Index: "+i);
				return;
			}
			for(int j=i+1;j<arr.length;j++)
			{
				checkSum=checkSum+arr[j];
				if(checkSum==sum)
				{
					System.out.println("The Sum Found Between "+i+" And "+j+" Index");
					return;
				}
			}
		}
		System.out.println("The Sum Not Found ");
	}
	public static void main(String[]args)
	{
		int arr[]= {15,2,4,8,9,10,23};
		subarray(arr,20);
	}
}
