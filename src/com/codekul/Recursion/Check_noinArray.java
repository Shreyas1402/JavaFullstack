package com.codekul.Recursion;

public class Check_noinArray {
    public static boolean Check(int arr[],int n,int no){
        if(n-1<0){
            return false;
        }
        if(arr[n-1]==no){
            return true;
        }
        return Check(arr,n-1,no);
    }

    public static void main(String[] args) {
        int arr[]={9,9,9};
        int n= arr.length;
        int no=8;
     boolean a=       Check(arr,n,no);
        System.out.println(a);
    }
}
