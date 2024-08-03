package Array;

public class SecondMinimum
{
    public static  int min(int []a)
    {
        int min=a[0];
        int secondMin=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                secondMin=min;
                min=a[i];
            }
            else if (a[i]<secondMin && a[i]!=min)
            {
                secondMin=a[i];
            }
        }
        return  secondMin;
    }

    public static void main(String[] args)
    {
        int []a={1,2,3,-4,5,-1};
        System.out.println(min(a));
    }
}
