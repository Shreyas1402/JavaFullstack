package com.codekul.HashMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Kclosest {

    public static void KClosest(int arr[],int k,int x,int n ){
        ArrayList<Integer>A=new ArrayList<>();
        TreeMap<Integer,Integer>Map=new TreeMap<>();
        for(int i=0;i<n;i++){
            int diff=Math.abs(arr[i]-x);
            Map.put(diff,i);


        }
        int j=0;
        for(java.util.Map.Entry<Integer,Integer> it:Map.entrySet()){
            if (j < k) {

                A.add(arr[it.getValue()]);

            }
            j++;
            }


        System.out.println(A);
    }

    public static void main(String[] args) {
        int arr[]={11,2,3,42,133,145};
        KClosest(arr,3,200, arr.length);

    }
}
