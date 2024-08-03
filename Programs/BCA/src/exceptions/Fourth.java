package exceptions;

public class Fourth
{
    public  static  void display(int a) throws  UserException
    {
        if(a>10)
            throw  new UserException(a);
        System.out.println("No Exception Occured");
    }

    public static void main(String[] args) throws  UserException
    {
        display(1);
        display(100);
    }
}
