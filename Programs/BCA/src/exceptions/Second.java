package exceptions;

public class Second
{
    public static void main(String[] args)
    {
        try
        {
            int a[]={1,2,3,4,5};
            int c=a[1]/0;
            System.out.println(a[5]);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Division By Zero");
        }
        catch (ArrayIndexOutOfBoundsException j)
        {
            System.out.println("Array Index Is Invalid");
        }
        System.out.println("Bye");

    }
}
