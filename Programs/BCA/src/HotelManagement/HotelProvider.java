package HotelManagement;

import java.util.Scanner;

public class HotelProvider extends Hotel
{
	Scanner sc=new Scanner(System.in);
	public void displayDetails() 
	{
		System.out.println("Hotel Name:-"+name);
		System.out.println("Veg/Non-Veg:-"+type);
		System.out.println("Address:-"+address);
		System.out.println("Contact No:"+phoneNo);	
	}
	@Override
	public void menu() 
	{
		System.out.println("-----------------"+name+"--------------------");
		System.out.println("---------------------------------------------");
		System.out.println(" Food  ----------------------  Price");
		System.out.println("Poha                           20 RS");
		System.out.println("Idli                           30 RS");
		System.out.println("Dosa                           40 RS");
		System.out.println("Vada-Pav                       15 RS");
		System.out.println("Medu-Vada                      35 RS");
		System.out.println("Pattice                        20 RS");
		System.out.println("---------------------------------------------");
	}
	
	@Override
	public void orderFood(String dishName,int quantity) 
	{
		double totalAmount=0;
		if(dishName.toUpperCase().equals("POHA")||dishName.toUpperCase().equals("PATTICE"))
		{
			totalAmount=20.0*quantity;
			System.out.println("You Have To Pay "+totalAmount);
			System.out.println("Pay First Take Coupon!!!");
			payment(totalAmount);
			System.out.println("Your Order Of "+dishName+" With Quantity: "+quantity+" Is Placed Successfully");
			greeting();
			System.out.println("---------------------------------------------");
		}
		else if(dishName.toUpperCase().equals("IDLI"))
		{
			totalAmount=30*quantity;
			System.out.println("You Have To Pay "+totalAmount);
			System.out.println("Pay First Take Coupon!!!");
			payment(totalAmount);
			System.out.println("Your Order Of "+dishName+" With Quantity: "+quantity+" Is Placed Successfully");
			greeting();
			System.out.println("---------------------------------------------");
		}
		else if(dishName.toUpperCase().equals("MEDU VADA"))
		{
			totalAmount=35*quantity;
			System.out.println("You Have To Pay "+totalAmount);
			System.out.println("Pay First Take Coupon!!!");
			payment(totalAmount);
			System.out.println("Your Order Of "+dishName+" With Quantity:"+quantity+" Is Placed Successfully");
			greeting();
			System.out.println("---------------------------------------------");
		}
		else if(dishName.toUpperCase().equals("DOSA"))
		{
			totalAmount=40*quantity;
			System.out.println("You Have To Pay "+totalAmount);
			System.out.println("Pay First Take Coupon!!!");
			payment(totalAmount);
			System.out.println("Your Order Of "+dishName+"With Quantity:"+quantity+" Is Placed Successfully");
			System.out.println("---------------------------------------------");
		}
		else if(dishName.toUpperCase().equals("VADA PAV"))
		{
			totalAmount=15*quantity;
			System.out.println("You Have To Pay "+totalAmount);
			System.out.println("Pay First Take Coupon!!!");
			payment(totalAmount);
			System.out.println("Your Order Of "+dishName+" With Quantity: "+quantity+" Is Placed Successfully");
			greeting();
//			System.out.println("---------------------------------------------");
			System.out.println("---------------------------------------------");
			
		}
		else
		{
			System.out.println("Dish Is Not Available In Menu Today!!!!!");
		}
	}
	@Override
	public void payment(double totalAmount) 
	{
		double amount=0.0;
		
		do
		{
			System.out.println("Enter Amount:");
			amount=sc.nextDouble();
			if(amount==totalAmount)
			{
				break;
			}
			else if(amount>=totalAmount)
			{
				System.out.println("Collect Your Change Of "+(amount-totalAmount));
				break;
			}
			else
			{
				System.out.println("Enter Correct Amount");
			}
		}while(amount!=totalAmount);
		
	}
	@Override
	public void review() {
		System.out.println("Enter Your Rating:");
		int  review=sc.nextInt();
		if(review>=0&&review<=5)
		{
			if(review==0||review==1)
			{
				System.out.println("Sorry For Inconvineience!!!");
			}
			else if(review==2||review==3)
			{
				System.out.println("We Will try to Give Better Service!!");
			}
			else if(review==4||review==5)
			{
				System.out.println("Thanks For Your Rating");
			}
		}
		
	}
}
