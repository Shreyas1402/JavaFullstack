package com.codekul.Recursion;

public class Array_sum {
   static int sum=0;
    public static int array_sum(int arr[],int n){
        if(n<1){
            return 0;
        }
        sum+=arr[n-1];
        array_sum(arr,n-1);
        return sum;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,1,1};
        int n=5;
        int c=array_sum( arr,n);
        System.out.println(c);
    }
}
