package com.codekul.Arrays;

import java.util.ArrayList;

public class Sieve {
    public static ArrayList<Integer> primenos(int n){
        ArrayList<Integer> A=new ArrayList<>();
        boolean arr[]=new boolean[n+1];
        int k=0;
        for(int i=2;i<=n;i++){
            for(int j=2;j<=n;j++){
                k=j*i;
                if(k<=n){
                    arr[k]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(arr[i]==false){
                A.add(i);
            }
        }

        return A;
    }




    public static void main(String[] args) {
        int n=10;
        System.out.println( primenos(50));
    }
}
