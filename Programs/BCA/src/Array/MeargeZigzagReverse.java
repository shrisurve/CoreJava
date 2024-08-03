package Array;
import  java.util.Arrays;
public class MeargeZigzagReverse
{
    public  static  int []merge(int []a,int []b)
    {
        int []c=new int[a.length+b.length];

        for(int i=a.length-1,k=b.length-1,j=0;j<c.length;i--,k--)
        {
            if(i<a.length && i>=0)//4<5 4>0//i=3,(3<5 && 3>0)
            {
                c[j++]=a[i];//c[0]=5//c[2]=a[3]=c[2]=4
            }
            if(k<b.length && k>=0)//2<3 &&2>0// k=1<3 && 1>0
            {
                c[j++]=b[k];//c[1]=3
            }
        }
        return  c;
    }
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5};
        int []b={1,2,3};
        int []c=merge(a,b);
        System.out.println(Arrays.toString(c));
    }
}
