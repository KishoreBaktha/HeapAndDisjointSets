package com.company;
import java.util.*;
public class disjointset {
    static int n;
    static int m;
    static int parent[];
    static int[] rank;
    static int[] size;
    static int maxsize=0;
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
         n=scanner.nextInt();
         m=scanner.nextInt();
        parent=new int[n+1];
        rank=new int[n+1];
        size=new int[n+1];
         for(int i=1;i<=n;i++)
         {
             makeset(i);
            // size[i]=scanner.nextInt();
            // if(size[i]>maxsize)
                // maxsize=size[i];
         }

         for(int i=0;i<m;i++)
         {
             union(scanner.nextInt(),scanner.nextInt());
         }
         for(int i=1;i<=n;i++)
            System.out.println(parent[i]);
    }

    private static void makeset(int i) {
        parent[i]=i;
    }
    public static int find(int i)
    {
        while(i!=parent[i])
        {
            i=parent[i];
        }
        return i;
    }
    private static void union(int i,int j)
    {
        int i_id=find(i);
        int j_id=find(j);
        if(i_id==j_id)
        {
            System.out.println(maxsize);
            return;
        }
        if(rank[i_id]>rank[j_id])
        {
            parent[j_id]=i_id;
          //  size[i_id]+=size[j_id];
         //   if(size[i_id]>maxsize)
             //   maxsize=size[i_id];
        }
        else
        {
            parent[i_id]=j_id;
          //  size[j_id]+=size[i_id];
         //   if(size[j_id]>maxsize)
               // maxsize=size[j_id];
        }
         //System.out.println(maxsize);
        if(rank[i_id]==rank[j_id])
            rank[j_id]+=1;
    }
}
