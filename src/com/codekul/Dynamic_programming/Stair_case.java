package com.codekul.Dynamic_programming;

public class Stair_case {
    static int count=0;
    static int steps=0;
    static int mini=Integer.MAX_VALUE;
    public static int ways(int n){
        if(n<0) {
            return 0;
        }
        if (n == 0) {
            count++;
            mini=Math.min(mini,steps);
            //steps=0;
            return count;
        }
          steps++;

        ways(n-1);
        ways(n-2);
       // ways(n-3);
       // System.out.println(mini);
        return count;

        }

    public static void main(String[] args) {
        int n=3;
       int c= ways(n);
        System.out.println(c);

    }
    }

