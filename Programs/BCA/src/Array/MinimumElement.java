package Array;

public class MinimumElement
{

    public  static  int min(int []a)
    {
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        int []a={1,2,3,4,5,0,-1,11};
        System.out.println(min(a));
    }
}
