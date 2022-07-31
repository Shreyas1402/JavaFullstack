package com.codekul.Arrays;

import java.util.Scanner;

public class TWODDEMO {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ELEMENTS:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
