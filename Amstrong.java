
package amstrong;
import java.util.*;

public class Amstrong {

   
    public static void main(String[] args) {
      int n,s=0,t,r;
      Scanner in=new Scanner(System.in);
      System.out.println("enter the number");
      n=in.nextInt();
      t=n;
      while(t!=0)
      {
          r=t;
          s=s+(r*r*r);
          t=t/10;
      }
      if(n==s)
      {
          System.out.println("amstronmg");
      }
      else
      {
          System.out.println("not ams");
           }
      
    }
    
}
