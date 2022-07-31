package com.codekul.Arrays;

import java.util.Scanner;

public class Addition_of_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[]={2,3,4,5,6,7};
        int sum =0;
        for(int i=0;i<a.length;i++){

            sum=sum+a[i];

        }
        System.out.println(sum);

    for(int i=a.length-1;i>=0;i--){
        System.out.println("REVERSE NUMBER");

        System.out.println(a[i]);
    }
    }
}

