package exceptions;


import java.util.Scanner;

public class Third
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int a=sc.nextInt();
        System.out.println("Enter Second Number:");
        int b=sc.nextInt();

        try
        {
            int c=a/b;
            System.out.println("Addition:-"+c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Number Can Not Be Divided By Zero!!!!!!!!!!!");
        }
        finally {
            System.out.println("End Of The Program!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        }



        double salary;
        System.out.println("Enter Your Salary Please");
        salary=sc.nextDouble();
        if(salary>100000)
            throw  new ArithmeticException("You Are Not Eligible For Free Tour");
        System.out.println("You Are Eligible");


    }
}
