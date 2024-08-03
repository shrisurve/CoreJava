package interfaceprograms;

public interface Bank
{

     void displayAccount();
     void debit(double amt);
     void credit(double amt);
     boolean login(String userName,String password);

}
