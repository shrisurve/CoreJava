package Array;

public class RotateArray {
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5,6,7};
      //  int []b=new int[2];
        int c[]=new int[7];
        int j=0;
        for(int i=2;i<a.length;i++)
        {
            c[j++]=a[i];
        }
        for(int i=0;i<2;i++)
        {
            c[j++]=a[i];
        }
        for(int x:c)
        {
            System.out.println(x);
        }
    }
}
