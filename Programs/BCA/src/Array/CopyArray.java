package Array;

import java.util.Arrays;

//Copy Elemnets Of Array From One Array To Another
public class CopyArray
{
    public  static  void copyArray(int []a,int []b)
    {
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }

    }
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5,6,};
        int []b= new int[a.length];
        copyArray(a,b);
        System.out.println(Arrays.toString(b));

    }
}
