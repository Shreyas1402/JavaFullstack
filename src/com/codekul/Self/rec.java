package com.codekul.Self;

public class rec {

    public static int height(int x, int n) {
        if (n == 0) {
            return 1;

        }
        if (x == 0) {
            return 0;
        }
        int y = height(x, n - 1);
        int z = x * y;

        return z;
    }


    public static void main(String[] args) {
        int x = 2, n = 5;
        height(x, n);
        int ans = height(x, n);
        System.out.println(ans);
    }
}
