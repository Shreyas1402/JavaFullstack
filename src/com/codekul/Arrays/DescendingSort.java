package com.codekul.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class DescendingSort {
    public static void Descending(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        print(arr);
    }

    public static void print(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={6,7,0,3,9,8};
        Descending(arr);

        Arrays.sort(arr,0,3);

        ArrayList<Integer>A=new ArrayList<>();
        //A.a
    }
}
