package com.codekul.SubArrays;

import java.util.HashMap;

public class Longest_subarray_of_sizeK {
    public static int findLargestSubarray(int arr[],int k,int n){
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxi=i+1;
            }
            if(map.containsKey(sum-k)){
                int index=map.get(sum-k);
                int ans=Math.abs(index-i);
               // System.out.println(ans);
                maxi=Math.max(maxi,ans);
            }

            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        System.out.println(map);
        return maxi;
    }

    public static void main(String[] args) {
        int arr[]={2,0,0,3};
       int b= findLargestSubarray(arr,3,arr.length);
        System.out.println(b);
    }
}
