package com.codekul.Recursion;

import java.util.ArrayList;

public class All_indices_in_Array {

   static ArrayList<Integer>A=new ArrayList<>();
    public static ArrayList<Integer> Indices(int arr[],int x,int j){
        if(j== arr.length){
            return A;
        }
        if(j== arr.length&&A.isEmpty()){
            A.add(-1);
        }

      if(arr[j]==x){
          A.add(j);
      }
      return Indices(arr,x,j+1);
    }

    public static void main(String[] args) {
        int arr[]={8,10,9,3,8,8,8,8};
        int x=8;
        int j=0;
        System.out.println(Indices(arr,x,j));
    }
}
