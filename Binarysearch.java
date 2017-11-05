
package binarysearch;

import java.util.*;


public class Binarysearch
{

   
    public static void main(String[] args)
    {
    int f,l,m,n,x,i,c = 0;
    int a[];
    Scanner in=new Scanner(System.in);
    System.out.println("enter num of elements");
    n=in.nextInt();
    a=new int[n];
    System.out.println("enter "+n+" num of elements");
    for(i=0;i<n;i++)
    {
        a[i]=in.nextInt();
    }
    System.out.println("enter the element to be searched");
    x=in.nextInt();
    f=0;
    l=n-1;
    for(i=0;i<n;i++)
    {
        m=(f+l)/2;
        if(a[m]==x)
        {
            c=1;
        }
        if(a[m]>x)
        {
            l=m-1;
        }
        if(a[m]<x)
        {
            f=m+1;
        }
    }
    if(c==1)
    {
        System.out.println("found");
    }
    else 
    {
        System.out.println("not found");
    }
    
   
}
}




    
    

