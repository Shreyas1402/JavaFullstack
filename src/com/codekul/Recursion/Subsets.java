package com.codekul.Recursion;

import com.codekul.Final.A;

import java.util.ArrayList;

public class Subsets {
    static ArrayList<ArrayList<Integer>>ans= new ArrayList<>();
    public static void subset(int arr[],ArrayList<Integer>op,int index){
        if(index >=arr.length){
            System.out.println(op);
            ans.add(op);
            return;
        }
       // System.out.println(op);
        // include karna hai

        int element=arr[index];
        op.add(element);
        subset(arr,op,index+1);
        // exclude karna hai (meaning just increment the index by one)
        op.remove(op.size()-1);//(if not removed the op arrayList keeps on adding unnecessary elements);

        subset(arr,op,index+1);

      //  System.out.println( ans);

    }

    public static void approach2(int arr[],ArrayList<Integer>op,int index){
        if(index> arr.length-1){
            //ans.add(op);
            System.out.print(op);
            op=new ArrayList<>();
         return;
        }
        approach2(arr,op,index+1);

        op.add(arr[index]);
        approach2(arr,op,index+1);
    }
    public static void main(String[] args) {
      //  ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>op=new ArrayList<>();
        int arr[]={1,2,4};
        int index=0;
       // subset(arr,op,0);
          approach2(arr,op,0);
      System.out.println(ans);

    }
}
