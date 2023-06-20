package com.codekul.Arrays;

import java.util.HashMap;

public class Maxfrequency{
    public static void WithoutHashMap(int arr[],int n){
        int i=1;
        int f=1;
        while(i<n){

            while(i<n&&arr[i]==arr[i-1]){
                f++;
                i++;

            }
            System.out.println("frequency of the element"+arr[i-1]+ " is "+f);
            i++;
            f=1;

            if(n==1){
                System.out.println("frequency of the element"+arr[i-1]+ " is "+1);

            }
        }

    }
    public static void UsingHashMap(int arr[],int n){
        HashMap<Integer,Integer> H=new HashMap<>();

        for(int i=0;i<n;i++){
            if(H.containsKey(arr[i])){
                int val=H.get(arr[i]);
                H.put(arr[i],val+1);
            }
            else{
                H.put(arr[i],1);
            }
        }
        System.out.println(H);
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,5,5,5,5,6,6,6,7,7,7,8,8,9,9};
        WithoutHashMap(arr, arr.length);
        UsingHashMap(arr, arr.length);
    }

}
