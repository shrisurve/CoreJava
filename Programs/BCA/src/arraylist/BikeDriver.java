package arraylist;
import java.util.ArrayList;
public class BikeDriver 
{
	public static void main(String[] args) 
	{
		ArrayList <Bike> bikes=new ArrayList<Bike>();
		bikes.add(new Bike("Yamaha","R15",150.00,150000.00));
		bikes.add(new Bike("Royal Enfield","GT 650",647.00,750000.00));
		bikes.add(new Bike("Royal Enfield","Classic 350",350.00,350000.00));
		bikes.add(new Bike("Bajaj","Pulsar",150.00,150000.00));
		bikes.add(new Bike("Bajaj","Pulsar",220.00,195000.00));
		bikes.add(new Bike("Bajaj","Dominor",400.00,395000.00));
		bikes.add(new Bike("Yamaha","R1",1000.00,50000.00));
		bikes.add(new Bike("Yamaha","FZ",160.00,15000.00));
		ArrayList<ArrayList<Bike>> unique= uniqueBrand(bikes);
		
		for(ArrayList<Bike> b:unique)
		{
			for(Bike x:b)
			{
				System.out.println(x);
			}
			System.out.println("**************\n");
		}
	}
	
	
	
	public static ArrayList<ArrayList<Bike>> uniqueBrand(ArrayList<?> b)
	{
		ArrayList<ArrayList<Bike>> brand=new ArrayList<>();
		for(Object o:b)
		{
			Bike x=(Bike)o;
			String s=x.name;
			boolean check=false;
			for(ArrayList <Bike>bikes:brand)
			{
				if(!bikes.isEmpty() && bikes.get(0).name.equals(s))
				{
					bikes.add(x);
					check=true;
				}
			}
			if(!check)
			{
				ArrayList<Bike> newList=new ArrayList<Bike>();
				newList.add(x);
				brand.add(newList);
			}
			
		}
		return brand ;
	}
	
}