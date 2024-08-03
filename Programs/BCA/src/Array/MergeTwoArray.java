package Array;
import  java.util.*;
public class MergeTwoArray
{
    public  static  int[]  mergeArray(int []a,int []b)
    {
        int []c=new  int[a.length+b.length];
        for(int i=0;i<c.length;i++)
        {
            if(i<a.length)
            {
                c[i]=a[i];
            }
            else
            {
                c[i]=b[i- a.length];
            }
        }
        return  c;
    }
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5,6};
        int []b={7,8,9,20};
        int []c=merge(a,b);
        System.out.println(Arrays.toString(c));
    }

    public static int[] merge(int []a,int []b)
    {
        int []c=new int[a.length+b.length];
        int i;
        for ( i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for(int j=0;j<b.length;j++)
        {
            c[i++]=b[j];
        }
        return  c;
    }
}
