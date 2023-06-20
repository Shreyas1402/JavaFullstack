package com.codekul.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int i=0;int j=0;int sum=0;
        long count=0;
        int arr[]={3,6,2,7,9};
        int n= arr.length;
        while(j<n){
            sum=sum+arr[j];

            if(j-i+1<2){
                j++;
            }
            else if(j-i+1==2){
                if(sum%2==0){
                    count++;
                }
            }
            sum=sum-arr[i];
            i++;
            j++;
        }
        System.out.println(count);
    }
}
