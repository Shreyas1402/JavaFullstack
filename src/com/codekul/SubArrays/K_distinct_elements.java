package com.codekul.SubArrays;

import java.util.HashMap;

public class K_distinct_elements {
    public static int count(int arr[],int k,int n){
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++){
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                map.put(arr[i],val+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        if(map.size()==k){
            count++;
        }
        for(int i=k;i<n;i++){
           if(map.containsKey(arr[i-k])){
               int val=map.get(arr[i-k]);
               val=val-1;
               if(val==0){
                   map.remove(arr[i-k]);
               }

           }
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                map.put(arr[i],val+1);
            }
            else{
                map.put(arr[i],1);
            }

            if(map.size()==k){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
      int a=  count(arr,3, arr.length);
        System.out.println(a);
    }
}
