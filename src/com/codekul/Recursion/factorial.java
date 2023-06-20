package com.codekul.Recursion;

public class factorial {
    static int fact=1;
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        fact= n*fact(n-1);
        return fact;
    }

    public static void main(String[] args) {
        int n=6;
     int c=   fact(n);
        System.out.println(c);
    }
}
