package practice;

import java.util.Scanner;
public class PrimeNumber
{
	public static boolean isPrime(int num)
	{
		if(num==1||num==0)
		{
			return false;
		}
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Starting number and Ending number: ");
		int start=scan.nextInt();
		int end=scan.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+" ");
			}
		}
	}
}
