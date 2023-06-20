package com.codekul.Recursion;

public class Fibbonacci {

    public static void fibo(int a,int b,int n){
        int sum=0;
        if(n>110){
            return;
        }

        sum=a+b;
        System.out.print(sum+" ");
        fibo(b,sum,n+1);
    }

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=0;
        System.out.print(a+" ");
        System.out.print(b+" ");
        fibo(a,b,n);
    }
}
