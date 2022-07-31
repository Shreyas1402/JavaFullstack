package com.codekul.Arrays;

import java.util.Scanner;

public class ADDITION_3_MATRIX {
    public static void main(String[] args) {


        int[][] array = new int[3][3];
        System.out.println("ENTER ELEMENTS OF 1ST MATRIX");
        Scanner sc = new Scanner(System.in);
        for (int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){

                array[i][j]= sc.nextInt();;
            }
        }
        int [][]b=new int[3][3];
        System.out.println("ENTER ELEMENTS OF 2ND MATRIX:");
        for (int i=0;i< array.length;i++){
            for(int j=0;j< array.length;j++){
                b[i][j]= sc.nextInt();
            }
        }
        int [][] c=new int[3][3];
        System.out.println("THE ADDITION IS:8");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=array[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();

        }
    }
}


