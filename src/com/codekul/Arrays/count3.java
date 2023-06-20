package com.codekul.Arrays;

import java.util.ArrayList;

public class count3 {
    public static void count(int arr[]){
        int temp[]=new int[50];

        for(int i=0;i< arr.length;i++){
            temp[arr[i]]++;
        }
             int sum=0;
        int count=0;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                if(temp[sum]>=1){
                    System.out.println(sum);
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    static  void remove_duplicate(int A[],int N){
            int i=0;
            int j=1;
            while(j<N){
                if(A[i]==A[j]){
                    A[j]=0;
                    if(j!=N-1) {
                        j++;
                    }
                }
                if(A[i]!=A[j]){
                    i=j;
                    j++;
                }

            }
            for(int k=0;k<N;k++) {
                System.out.print(A[k]+" ");
            }
    }
    static void remove(int C[],int N){
        ArrayList<Integer>A=new ArrayList<>();
        int j=1;
        for(int i=0;i<N;i++){
            if(!A.contains(C[i])) {
                A.add(C[i]);
            }
        }

        System.out.println(A);
    }

    public static void main(String[] args) {
        int arr[]={12,8,2,11,5,14,10};
        int C[]={1,2,2};
        ArrayList<Integer>B=new ArrayList<>();
        B.add(1);
        B.add(2);
        B.add(2) ;
        B.add(2);
        remove(C, C.length);
    //remove_duplicate(C,C.length);
        //count(arr);
    }
}
