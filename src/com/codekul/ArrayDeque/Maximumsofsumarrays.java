package com.codekul.ArrayDeque;

import java.util.ArrayList;

public class Maximumsofsumarrays {
    static ArrayList<Integer>A=new ArrayList<>();

    public static void maxofK(int arr[],int j,int k,int n){

        if(k>n){
            return;
        }
         int max=0;
        for(int i=j;i<k;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            A.add(max);
        maxofK(arr,j+1,k+1,n);

    }

    public static void main(String[] args) {
        int arr[]={10,8,5,12,15,7,6};
        maxofK(arr,0,3, arr.length);
        System.out.println(A);
    }

}
