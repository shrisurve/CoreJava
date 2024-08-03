package HotelManagement;

public class HotelDriver 
{
	public static void main(String[] args) 
	{
		Hotel h1=new HotelProvider();
		h1.displayDetails();
		h1.menu();
		h1.orderFood("Idli", 5);
	}
}

