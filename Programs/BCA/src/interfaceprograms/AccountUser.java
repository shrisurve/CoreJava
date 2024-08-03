package interfaceprograms;

public class AccountUser
{
    public static void main(String[] args)
    {
        Bank b1=new SavingAccount("Shubham",8793569631l,"Pune","shubhamp13","Shubham@144");
//        System.out.println(b1.hashCode());

        if(b1.login("shubhamp13","Shubham@144"))
        {
            System.out.println("Login Successful");
            b1.displayAccount();
            b1.credit(100000);
            b1.debit(400);

        }
        else
        {
            System.out.println("Invalid Credentials");
        }
    }
}
