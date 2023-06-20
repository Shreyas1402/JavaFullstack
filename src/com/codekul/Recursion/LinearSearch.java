package com.codekul.Recursion;

public class LinearSearch {

    public static boolean search(int arr[],int i,int x){
        if(arr.length==0){
            return true;
        }
        if(i== arr.length){
            return false;
        }
        if(arr[i]==x){
            return true;
        }
        return search(arr,i+1,3);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(search(arr,0,3));

    }
}
