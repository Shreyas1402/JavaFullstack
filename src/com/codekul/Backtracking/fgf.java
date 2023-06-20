package com.codekul.Backtracking;

public class fgf {
    public static int p(int a,int b){
        if(a>12){
            return 9;
        }
        p(a+2,b+4);
        p(a+3,b+6);
        p(a+5,b+4);

        return a+b;


    }

    public static void main(String[] args) {
        int a=8;
        int b=3;
      int c=  p(a,b);
        System.out.println(c);
    }
}
