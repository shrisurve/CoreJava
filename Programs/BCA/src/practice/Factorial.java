//Write a java program to find a factorial using recursion
package practice;

public class Factorial
{
	public static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
	public static void main(String[]args)
	{
		System.out.println("Factorial: "+factorial(5));
		
	}
}
