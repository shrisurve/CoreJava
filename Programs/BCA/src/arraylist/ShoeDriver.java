package arraylist;
import java.util.ArrayList;
public class ShoeDriver 
{
	public static void main(String[] args) 
	{
		ArrayList<Shoe> shoes=new ArrayList<Shoe>();
		shoes.add(new Shoe("Puma",2999, 8,"Running Shoes"));
		shoes.add(new Shoe("Adidas",3999,7,"Hiking Shoes"));
		shoes.add(new Shoe("Reebok",4999, 10,"Adventure Sports Shoes"));
		shoes.add(new Shoe("Nike",1999,9,"Walking Shoes"));
		shoes.add(new Shoe("Puma",3599, 8,"Tennis Shoes"));
		shoes.add(new Shoe("Adidas",1999,5,"Racing Shoes"));
		shoes.add(new Shoe("Reebok",5999, 8,"Cycling Shoes"));
		shoes.add(new Shoe("Nike",1999,8,"Walking Shoes"));
		ArrayList<ArrayList<Shoe>> sorted=uniqueBrand(shoes);
		display(sorted);
		
	}
	
	public static ArrayList<ArrayList<Shoe>> uniqueBrand(ArrayList<Shoe> b)
	{
		ArrayList<ArrayList<Shoe>> unique=new ArrayList<ArrayList<Shoe>>();
		for(Object o:b)
		{
			Shoe s=(Shoe)o;
			String brandName=s.getBrandName();
			boolean check=false;
			for(ArrayList<Shoe> temp :unique)
			{
				if(!temp.isEmpty() && temp.get(0).getBrandName().equals(brandName))
				{
					temp.add(s);
					check=true;
				}
			}
			if(!check)
			{
				ArrayList<Shoe>newBrand=new ArrayList<Shoe>();
				newBrand.add(s);
				unique.add(newBrand);
			}
			
		}
		return unique;
	}
	public static void display(ArrayList<ArrayList<Shoe>> b)
	{
		for(ArrayList<Shoe>shoes:b)
		{
			for(Shoe product:shoes)
			{
				System.out.println(product);
			}
			System.out.println("*****************");
		}
	}
}