package com.codekul.Recursion;

public class First_IndexofNumber {

    public static int Index(int arr[],int i,int j){
        if(j>=arr.length){
            return -1;
        }

        if(arr[j]==i){
            return j;
        }


        return Index(arr,i,j+1);

    }

    public static void main(String[] args) {
        int arr[]={8,12,8,7};
        int i=9;
        int j=0;
       int c= Index(arr,i,j);
        System.out.println(c);

    }
}
