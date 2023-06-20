package com.codekul.SubArrays;

public class Largest_Subarray_of_sumK {

    public static int count(int arr[],int n,int k){
        int i=0;
        int j=0;
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        while(i<n&&j<n){
            sum+=arr[i];

            if(sum<k){
                i++;
            }
         else if(sum==k) {
                maxi = Math.max(maxi,i-j+1);
            }

            if(sum>k){
                    sum = sum - arr[j];
                    j++;
                }
            }

        return maxi;
    }
    public static void main(String[] args) {
        int arr[]={4,4,3,4,2,3,5};
        int x=count(arr, arr.length, 5);
        System.out.println(x);
    }
}
