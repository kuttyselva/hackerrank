/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addmatrix;

import java.util.Scanner;
public class Addmatrix {

   
    public static void main(String[] args) {
      int m,n,p,q;
      Scanner in=new Scanner (System.in);
      System.out.println("enter the row and column of 2 matrix");
      m=in.nextInt();
      n=in.nextInt();
      int f[][]=new int [m][n];
      int s[][]=new int [m][n];
      int t[][]=new int [m][n];
      
      System.out.println("enter elements 1 mat");
      for(p=0;p<m;p++)
      {
          for(q=0;q<n;q++)
          {
              f[p][q]=in.nextInt();
          }
      }
      System.out.println("enter elements 2 mat");
      for(p=0;p<m;p++)
      {
          for(q=0;q<n;q++)
          {
              s[p][q]=in.nextInt();
          }
      }
      for(p=0;p<m;p++)
      {
          for(q=0;q<n;q++)
          {
              t[p][q]=f[p][q]+s[p][q];
          }
      }
      System.out.println("the sum of matrix");
            for(p=0;p<m;p++)
      {
          for(q=0;q<n;q++)
          {
              System.out.print(t[p][q]+"\t");
               
          }
          System.out.println();
      }
    }
    
}
