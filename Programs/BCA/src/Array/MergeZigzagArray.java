package Array;

public class MergeZigzagArray 
{
	public static void main(String[]args)
	{
		int []a = {1,2,3,4,5,6,7,8,9,10,11};
		int []b = {1,2,3,4,5,6,7,8,9};
		int []c = new int[a.length+b.length];
		for(int i=0,j=0;j<c.length;i++)
		{
			if(i<a.length)
			{
				c[j++]=a[i];
			}
			if(i<b.length)
			{
				c[j++]=b[i];
				
			}
			
		}
		
		for(int x:c)
		{
			System.out.print(x+" ");
			
		}
	}
}
