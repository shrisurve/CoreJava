package HotelManagement;

public abstract class Hotel 
{
	protected String name="Sukanta Hotel";
	protected String type="Vegetarian Hotel";
	protected String address="Deccan Pune";
	protected long phoneNo=987654321l;
	
	public abstract void orderFood(String dishName,int quantity);
	public abstract void payment(double totalAmount);
	abstract public void menu();
	abstract public void review();
	abstract public void displayDetails();
	public void greeting()
	{
		System.out.println("Thank You Visit Again!!!!!!!");
	}
}
