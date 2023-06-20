package com.codekul.Arrays;


import java.util.HashMap;

public class Printallpairs {
    public static void printpair(int arr[]){
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void swap(int arr[]){
        System.out.println(" original array is: ");
        int n= arr.length;
        for(int l=0;l<n;l++){
            System.out.print(arr[l]+" ");
        }
        int i=0;
        System.out.println();
        while(i<n-1){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i=i+2;
        }
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static int firstRepeated(int[] arr, int n) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                return map.get(arr[i]);
            }
            else{
                map.put(arr[i],i);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={7,4,0,9,4,8,8,2,4,5,5,1};
       // printpair(arr);
      //  swap(arr);
        int c=firstRepeated(arr,arr.length);
        System.out.println(c);
        
    }
}
