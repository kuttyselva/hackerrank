
package hackerrank;

import java.util.*;
import java.io.*;
import java.text.*;
public class Hackerrank {
    static int solve(String opr)
    {
     
     char []a=opr.toCharArray();
     if(a[1]=='+')
     {
         int x=Character.getNumericValue(a[0]);
          int y=Character.getNumericValue(a[2]);
          return(x+y);
     }
     else if(a[1]=='*')
     {
         int x=Character.getNumericValue(a[0]);
          int y=Character.getNumericValue(a[2]);
          return(x*y);
     }
     else
     {
         int x=Character.getNumericValue(a[0]);
          int y=Character.getNumericValue(a[2]);
          return(x-y);
         
     }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opr=in.next();
        int result=solve(opr);
        System.out.println(result);
        in.close();
           
    }
    
}
        
