package com.codekul.Self;

public class fibo {
    public static void main(String[] args) {
        int sum=0;
        System.out.print(0+" ");
        System.out.print(1+" ");
        int x=0;
        int y=1;
        int i=1;
        while(i<5){
            sum=x+y;
            System.out.print(sum+" ");
            x=y;
            y=sum;
            i++;
        }
    }
}
