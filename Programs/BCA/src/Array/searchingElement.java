package Array;
import java.util.Scanner;
public class searchingElement 
{
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int []a = {7,8,9,4,5,3,2,6};
		System.out.println("Enter the Element for Search: ");
		int key=scan.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.println("Find Successfully at: "+a[i]);
				System.exit(0);
			}
		}
		System.out.println("Opps!!! Can't Find");
		
	}
	
	
}
