package com.codekul.Self;

public class Factorial {
    public static void main(String[] args) {
        int a = 9;

        System.out.println(fact(a));
    }

    public static int fact(int num) {
        if (num == 0) {
            return 1;

        } else {
            int factorial = 1;
            int i;
            for ( i = 1; i <=num; i++)
            {
                factorial = factorial * i;

            }
            return num*fact(num-1);

        }

    }
}
