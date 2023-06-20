package com.codekul.HashMap;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Countdistinct {
    static void countDistinct(int A[], int n, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> M=new ArrayList<>();
       for(int i=0;i<k;i++){
           if(map.containsKey(A[i])){
               int val=map.get(A[i]);
               map.put(A[i],val+1);

           }
           else{
               map.put(A[i],1);
           }

       }
       M.add(map.size());
       for(int i=k;i<n;i++){
           int val=map.get(A[i-k]);
           val=val-1;
           if(val==0){
               map.remove(A[i-k]);
           }
           else{
               map.put(A[i-k],val);
           }
           if(map.containsKey(A[i])){
               int vall=map.get(A[i]);
               map.put(A[i],vall+1);

           }
           else{
               map.put(A[i],1);
           }

           M.add(map.size());
       }
        System.out.println(map);
        System.out.println(M);
    }

    public static void main(String[] args) {
        int arr[]={1,2 ,1, 3, 4, 2, 3};
        countDistinct(arr,arr.length,4);
    }

}
