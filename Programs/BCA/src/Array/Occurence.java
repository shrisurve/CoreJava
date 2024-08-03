package Array;
//import  java.util.*;
public class Occurence
{
    public  static  int count(int []a,int n)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                ++count;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        int []a={1,2,3,4,5,6,7,8,9,1,1,1,1,1};
        int n=1;
        System.out.println(count(a,n));
    }
}
