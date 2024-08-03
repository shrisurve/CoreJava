package exceptions;

public class UserException extends  Exception
{
    private  int a;
    UserException(int a)
    {
        this.a=a;
    }

   public  String toString()
   {
       return  "User Defined Exception Created By Shubham Puri "+a+" Ocuured";
   }
}
