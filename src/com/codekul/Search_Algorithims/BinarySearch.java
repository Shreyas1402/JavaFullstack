package com.codekul.Search_Algorithims;

import java.util.HashMap;
import java.util.Map;

public class BinarySearch {
    public int binarySearch(int arr[],int value){
        int start=0;
        int end= arr.length;
      //  int mid=(start+end)/2;
        boolean flag=false;
        HashMap<Integer,Integer>map=new HashMap<>();
        int upper=Integer.MIN_VALUE;
        int lower=Integer.MAX_VALUE;

        while(start<=end){

          int mid=(start+end)/2;

            if(value<arr[mid]) {

                end = mid - 1;

            }

            else if(arr[mid]==value){
                flag =true;
                 break;

            }
            else{
                start=mid+1;
            }



        }
        if(flag==false){
            for(int i=0;i< arr.length;i++){
                int diff=value-arr[i];
                map.put(diff,i);
            }
            System.out.println(map);
            int mini=Integer.MAX_VALUE;
            int maxi=Integer.MIN_VALUE;
            for(Map.Entry<Integer,Integer> it: map.entrySet()){
                if(it.getKey()>0){
                 mini=Math.min(mini, it.getKey());

            }
                if(it.getKey()<0){
                    maxi=Math.max(maxi, it.getKey());
                }
            }
            int l=map.get(mini);
            int r=map.get(maxi);
            System.out.println("NEAREST SMALLER ELEMENT"+arr[l]);
            System.out.println("Largest element"+arr[r]);

        }
        else{
            return 1;
        }


        return -1;
    }
}
 class main1{
    public static void main(String[] args) {
        BinarySearch S=new BinarySearch();
        int arr[]={8,9,13,14,15,17,19};
        System.out.println(  S.binarySearch(arr,2));


    }
}
