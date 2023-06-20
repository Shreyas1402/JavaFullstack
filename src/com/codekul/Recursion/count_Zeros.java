package com.codekul.Recursion;

import java.util.Scanner;

public class count_Zeros {
    static int temp=0;
    public static int count(int x){
        if(x<=0){
            return temp;
        }
        if(x%10==0){
            temp++;
        }
        x=x/10;
        return count(x);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int x= sc.nextInt();
        int c=count(x);
        System.out.println(c);
    }
}
