package Array;
import java.util.Arrays;
public class BubbleSort
{
    public  static  void sort(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int a[]={1,2,0,-8,11,8};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
