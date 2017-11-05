
package arrays;
import java.util.*;

public class Arrays {

   
    
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int arr[],i,sum=0;
       arr=new int[20];
       for(i=0;i<5;i++)
       {
           arr[i]=in.nextInt();
       }
       for(i=0;i<10;i++)
       {
           sum=sum+arr[i];
       }
        System.out.println("tot sum of array is"+sum);
    }
    
}
