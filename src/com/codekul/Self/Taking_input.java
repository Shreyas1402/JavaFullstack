package com.codekul.Self;

import java.util.Scanner;


public class Taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE 1ST NUMBER");
        int a = sc.nextInt();
        System.out.println("ENTER THE 2ND NUMBER");
        int b = sc.nextInt();
        System.out.println("THE FIRST NUMBER ENTERED IS: " + a);
        System.out.println("THE SECOND NUMBER ENTERED IS: " + b);
        System.out.println("ADDITION OF THESE TERMS IS:" + (a+b));
    }

}
