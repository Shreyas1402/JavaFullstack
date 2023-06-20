package com.codekul.Dynamic_programming;


import java.util.Arrays;

public class Fibonacci {

    public static int  fibo(int n,int arr[]){
        int res=0;
        if(arr[n]==-1){
            if(n==1||n==0){
                res= n;
            }
            else {
                res = fibo(n - 1, arr) + fibo(n - 2, arr);
            }
            arr[n]=res;
        }
        return arr[n];
    }

    public static int findNthFibonacci(int number)
    {
        int f[]=new int[number+1];
        f[0]=0;
        f[1]=1;

        for(int i=2;i<=number;i++){
            f[i]=f[i-1]+f[i-2];
        }


        return f[number-1];
    }


    public static void main(String[] args) {
        int arr[]=new int [100];
        Arrays.fill(arr,-1);
        System.out.println(findNthFibonacci(50));


        System.out.println(fibo(50,arr));
    }
}
