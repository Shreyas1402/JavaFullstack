package com.codekul.Recursion;

public class numberofdigits {
    static int count=0;

    public static int count(int n){
        if(n==0){
            return count;
        }
        if(n!=0){
            count++;
        }
        n=n/10;
        count(n);
        return count;
    }

    public static void main(String[] args) {
        int n=1111111111;
        int c=count(n);
        System.out.println(c);
    }
}
