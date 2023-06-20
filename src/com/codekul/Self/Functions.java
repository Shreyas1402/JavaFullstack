package com.codekul.Self;

public class Functions {
    public static void calculate(int a, int b){
        int sum=0;

        sum=a*b;
        String x=Integer.toString(sum);
        System.out.println(sum);
        System.out.println(x);
    }
    public static void main(String[] args) {
        int a=8;
        int b=9;
        calculate(a,b);
      // String c= calculate(a,b);
       // System.out.println(c);
       //System.out.println(calculate(a,b));
    }
}
