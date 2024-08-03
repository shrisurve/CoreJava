package Array;
public class LinearSearch
{
    public  static  int linearSearch(int []a,int n)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                return  i;
            }
        }
        return  -1;
    }
    public static void main(String[] args)
    {
        int n=1;
        int []a={1,2,3,4,5,6,7,8,9};
        if(linearSearch(a,n)==-1)
        {
            System.out.println("Element Is Not Present Inside The Array");
        }
        else
        {
            System.out.println("Element Is Present at "+linearSearch(a,n)+" Index");
        }
    }
}
