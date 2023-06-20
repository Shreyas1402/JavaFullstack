package com.codekul.Self;

import java.util.Scanner;

public class Checktheno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1;j++) {
                if (a[0] == 1 && a[n - 1] == n) {
                    break;
                }
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+ 1];
                    a[j+ 1] = temp;
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
