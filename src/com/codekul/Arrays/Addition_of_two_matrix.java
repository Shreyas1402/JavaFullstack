package com.codekul.Arrays;

import java.util.Scanner;

public class Addition_of_two_matrix {
    public static void main(String[] args) {


        int[][] array = new int[2][2];
        System.out.println("ENTER ELEMENTS OF 1ST MATRIX");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){

                array[i][j]= sc.nextInt();;
            }
        }
        int [][]b=new int[2][2];
        System.out.println("ENTER ELEMENTS OF 2ND MATRIX:");
        for (int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                b[i][j]= sc.nextInt();
            }
        }
        int [][] c=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=array[i][j]+b[i][j];
                System.out.println("ADDITION IS:");
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }
    }
}
