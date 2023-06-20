package com.codekul.Recursion;

public class Checkifarrayissorted {
    public static boolean isSorted(int arr[],int i,int n){
        if(n==-1){
            return true;
        }
        if(i==n){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr,i+1,n);
    }
    public static boolean check_from_behind(int arr[],int n){
        if(n==0||n==-1){
            return true;
        }
        if(arr[n]<arr[n-1]){
            return false;
        }
        return check_from_behind(arr,n-1);
    }
    public static int sum(int arr[],int n ){
        if(n==-1){
            return 0;
        }

        return arr[n]+sum(arr,n-1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,6};
       // System.out.println(arr.length);
        System.out.println(isSorted(arr,0, arr.length-1));
        System.out.println( check_from_behind(arr, arr.length-1));
        System.out.println(sum(arr, arr.length-1));
    }
}
