package Array;
import  java.util.Arrays;
public class ZigzagMeargeFirstReverse
{
    public  static  int [] merge(int []a,int []b)
    {
        int []c=new int[a.length+b.length];
        for(int i=(a.length-1) ,j=0,k=0;j<c.length;i--,k++)
        {
            if(i<a.length && i>=0)
            {
                c[j++]=a[i];
            }
            if(k<b.length)
            {
                c[j++]=b[k];
            }
        }
        return c;
    }
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5};
        int []b={1,2,3};
        int c[]=merge(a,b);//{5,1,4,2,3,3,2,1}
        System.out.println(Arrays.toString(c));
    }
}
