package com.codekul.Recursion;

import java.util.ArrayList;

public class SUBSET_II {
    public static void USING_FOR(int arr[],int N){
        ArrayList<ArrayList<Integer>>B=new ArrayList<>();
        ArrayList<Integer>A;
        for(int i=1;i<N;i++){
            A=new ArrayList<>();
            if(arr[i]==arr[i-1]){
                continue;
            }
            else {
                A.add(arr[i-1]);
            }
            for(int j=i;j<N;j++){
                if(arr[j]==arr[j-1]){
                    continue;
                }
                else{
                    A.add(arr[j]);
                    B.add(A);
                }
            }

        }
        System.out.println(B);
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,2,3,3};
        USING_FOR(arr, arr.length);
    }
}
