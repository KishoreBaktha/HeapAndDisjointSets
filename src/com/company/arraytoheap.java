package com.company;
import java.util.*;
//array to maxheap,memeory saved
public class arraytoheap {
    static int[] A;
    static int size;
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        size=scanner.nextInt();
        A=new int[size+1];
        for(int i=1;i<=size;i++)
         A[i]=scanner.nextInt();
        buildheap(A);
        for(int i=1;i<=5;i++)
            System.out.println(A[i]);
        for(int i=1;i<=5;i++)
        {
            swap(1,size);
            size=size-1;
            shiftdown(1);
        }
        for(int i=1;i<=5;i++)
            System.out.println(A[i]);
    }

    private static void buildheap(int[] a) {
        for(int i=size/2;i>=1;i--)
        {
            shiftdown(i);
        }
    }

    private static void shiftdown(int i) {
        int maxIndex=i;
        int l=2*i;
        if(l<=size&&A[l]>A[maxIndex])
            maxIndex=l;
      //  System.out.println("maxindex-"+maxIndex);
        int r=2*i+1;
        if(r<=size&&A[r]>A[maxIndex])
            maxIndex=r;
        if(i!=maxIndex)
        {
            swap(i, maxIndex);
            shiftdown(maxIndex);
        }
    }
    private static void swap(int i, int i1) {
        int temp=A[i];
        A[i]=A[i1];
        A[i1]=temp;
    }
}
