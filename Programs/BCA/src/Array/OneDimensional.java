package Array;
public class OneDimensional
{
    int []arr=null;
    public OneDimensional(int size)
    {
        arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public  void insert(int location,int element)
    {
        try
        {
            if(arr[location]==Integer.MIN_VALUE)
            {
                arr[location]=element;
                System.out.println("Element Is Inserted");
            }
            else
            {
                System.out.println("Index Is Already inserted");
            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Is Not Defined");
        }
    }
    public void traverse()
    {
        try
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        catch (Exception e)
        {
            System.out.println("Array Does Not Exist");
        }
    }
    public  void search(int element)
    {
        try
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==element)
                {
                    System.out.println("\nElement Found At "+i+" Index");
                    return;
                }
            }
            System.out.println("Element Not Found");
        }
        catch (Exception e)
        {
            System.out.println("Array No Longer Exist");
        }
    }

    public static void main(String[] args)
    {
        OneDimensional e=new OneDimensional(10);
        e.insert(0,110);
        e.insert(1,-20);
        e.insert(2,30);
        e.insert(3,40);
        e.insert(4,-50);
        e.insert(5,60);
        e.insert(6,70);
        e.insert(7,80);
        e.insert(8,90);
        e.insert(9,100);
     //   e.sort();
        e.traverse();
    }
}