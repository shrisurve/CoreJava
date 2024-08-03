package arraylist;
import java.util.*;
public class ArrayListFirst 
{
	public static void main(String[] args)
	{	
		ArrayList<Object> a=new ArrayList<Object>();
		a.add(10);
		a.add(123.12);
		a.add(123.456f);
		a.add(12l);
		a.add('c');
		a.add("Shubham");
		ListIterator<Object> iter=a.listIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		System.out.println(iter);
		System.out.println("Traversing Reverse");
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}
	
	}
		
}