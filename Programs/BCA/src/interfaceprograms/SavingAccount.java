package interfaceprograms;

public class SavingAccount implements  Bank
{
    String name;
    long accountNo;
    long phoneNo;
    double balance;
    String userName;
    String password;
    String address;

    public  SavingAccount()
    {
        super();
    }
   // @Override
//    public int hashCode() {
//    	// TODO Auto-generated method stub
//    	return 7796277;
//    }

    public SavingAccount(String name,long phoneNo, String address,String userName, String password) {
        this.name = name;
        accountNo = this.hashCode();
        this.phoneNo = phoneNo;
        this.userName = userName;
        this.password = password;
        this.address=address;
    }

    @Override
    public void displayAccount()
    {
        System.out.println("Name:"+name);
        System.out.println("Account Number: "+accountNo);
        System.out.println("Contact Number: "+phoneNo);
        System.out.println("Address: "+address);
    }

    @Override
    public void credit(double amt)
    {
        if(amt>0)
        {
            balance+=amt;
            System.out.println(amt+" Amount Is Credited To Your Account");
            System.out.println("Account No:"+accountNo);
            System.out.println("Available Balance:"+balance);
        }
        else
        {
            System.out.println("Invalid Amount");
        }
    }

    @Override
    public void debit(double amt)
    {
        if(balance-amt>1000&&amt>0)
        {
            balance-=amt;
            System.out.println(amt+" Amount Is Dedited To Your Account");
            System.out.println("Account No:"+accountNo);
            System.out.println("Available Balance:"+balance);
        }
        else
        {
            System.out.println("Invalid Amount");
        }
    }

    @Override
    public boolean login(String userName, String password)
    {
        if(userName.equals(this.userName)&&password.equals(this.password))
        {
            return  true;
        }
        return  false;
    }
}
