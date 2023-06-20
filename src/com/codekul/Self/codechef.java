package com.codekul.Self;


import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
       //int d= Sum(a,b);


        System.out.println(Sum(2,3,4,5));


    }
    public static int Sum(int ... arr){
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }

        return sum;
    }

}





