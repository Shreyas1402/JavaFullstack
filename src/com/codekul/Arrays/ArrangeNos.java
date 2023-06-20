package com.codekul.Arrays;

import java.util.ArrayList;

public class ArrangeNos {
    public static void Arrange(int n){
        int arr[]=new int[n];
        int j=1;
        for(int i=0;i<n/2;i++){
            arr[i]=j;
            j=j+2;
        }
        int c=n;
        for(int m=n/2;m<n;m++){
            arr[m]=c;
            c=c-2;
        }

        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }

    }
    public static void Arrange2(int n){
        int arr2[]=new int [n];
        int i=0;
        int j=n-1;
        int m=1;
        while(i<j){
            arr2[i]=m;
            m++;
            arr2[j]=m;
            i++;
            j--;
            m++;
        }
        System.out.println(" new arrangement" );
        for(int k=0;k<n;k++){

            System.out.print(arr2[k]+" ");

        }
    }

    public static void main(String[] args) {
        Arrange(10);
        Arrange2(10);

    }
}
