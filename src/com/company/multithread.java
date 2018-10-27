package com.company;
import java.util.*;
public class multithread {
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int m=s.nextInt();
       int[] time=new int[m];
       int[] numthread=new int[n];
       int thread=0;int min=99999;
       for(int i=0;i<m;i++)
           time[i]=s.nextInt();int j;
        for( j=0;j<n;j++)
        {
               System.out.print(j + " " + 0);
                System.out.println();
                numthread[j] += time[j];
                if (numthread[j] < min)
                {
                    min = numthread[j];
                    thread = j;
                }
        }
       for(int i=j;i<m;i++)
       {
            System.out.print(thread+ " "+numthread[thread]);
            System.out.println();
            numthread[thread]+=time[i];
             min=9999;
           for(j=0;j<n;j++)
           {
               if (numthread[j] < min)
               {
                   min = numthread[j];
                   thread = j;
               }
           }
       }
    }
}
