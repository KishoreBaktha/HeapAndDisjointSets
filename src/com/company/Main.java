package com.company;
import java.util.*;
//binary max heap
public class Main {
    static int maxsize;
  static int[] H,A;
  static int[] Parent,Leftchild,Rightchild;
  static int size;
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
         maxsize=scanner.nextInt();
        H=new int[maxsize+1];
        A=new int[maxsize+1];
        Parent=new int[maxsize+1];
        Leftchild=new int[maxsize+1];
        Rightchild=new int[maxsize+1];
         size=0;
         A[0]=0;
        for(int i=1;i<=maxsize;i++)
          A[i]=scanner.nextInt();
        heapsort(A);
       for(int i=1;i<=maxsize;i++)
            System.out.println(A[i]);
    }
    private static int extractmax() {
        int result=H[1];
        H[1]=H[size];
        size=size-1;
        shiftdown(1);
        return result;
    }

    private static void shiftdown(int i) {
        int maxIndex=i;
        int l=Leftchild[i];
        if(l<=size&&H[l]>H[maxIndex])
            maxIndex=l;
        int r=Rightchild[i];
        if(r<=size&&H[r]>H[maxIndex])
            maxIndex=r;
        if(i!=maxIndex)
        {
            swap(i, maxIndex);
            shiftdown(maxIndex);
        }
    }

    private static void heapsort(int[] a) {
        for(int i=1;i<=maxsize;i++)
            insert(a[i]) ;
        for(int i=1;i<=maxsize;i++)
            System.out.println(H[i]);
        //Ascending order
//        for(int i=maxsize;i>=1;i--)
//            A[i]=extractmax();
        //descending order
        for(int i=1;i<=maxsize;i++)
            A[i]=extractmax();
    }

    private static void insert(int i) {
        size++;
        H[size]=i;
        Parent[size]=size/2;
        Leftchild[size]=2*size;
        Rightchild[size]=2*size+1;
        shiftup(size);

    }

    private static void shiftup(int i) {
        while(i>1&&H[Parent[i]]<H[i])
        {
            swap(Parent[i],i);
            i=Parent[i];
        }
    }

    private static void swap(int i, int i1) {
        int temp=H[i];
        H[i]=H[i1];
        H[i1]=temp;
    }
}
