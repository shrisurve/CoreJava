package Array;

import java.util.Arrays;

public class CopyArrayReverse
{
    public static void reverseCopy(int []a,int []b)
    {
        for(int i=a.length-1;i>=0;i--)
        {
            b[(b.length-1)-i]=a[i];
        }

    }
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5,6};
        int []b=new int[a.length];
        reverseCopy(a,b);
        System.out.println(Arrays.toString(b));
    }
}