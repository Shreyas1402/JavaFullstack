package com.codekul.Arrays;

import java.util.Scanner;

public class Findelementin2D {
    public static void printspiral(int arr[][]){
       int top=0;
       int right= arr[0].length-1;
       int bottom= arr.length-1;
       int left=0;

       while(top<=bottom&&left<=right){
           for(int i=left;i<=right;i++){
               System.out.print(arr[top][i]+" ");
           }
           top++;

           for(int i=top;i<=bottom;i++){
               System.out.print(arr[i][right]+" ");
           }
           right--;
           if(top<=bottom) {
               for (int i = right; i >= left; i--) {
                   System.out.print(arr[bottom][i]+" ");
               }
           }
           bottom--;
           if(left<=right) {
               for (int i = bottom; i >= top; i--) {
                   System.out.print(arr[i][left]+" ");
               }
           }
           left++;
       }


    }
    static void diagonal(int temp[][]){
        int i=0;
        while(i< temp.length){
            System.out.print(temp[i][i]+" ");
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  int rows=sc.nextInt();
       // int cols=sc.nextInt();
        //int x=5;
        //int count=0;
        //int [][] arr=new int[rows][cols];
/*
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

       // printspiral(arr);*/
        int temp[][]={{1,2,3},{5,6,7},{9,10,11},{13,14,15},{16,17,18}};
        for(int j=0;j<temp[0].length;j++){
            for(int i=0;i< temp.length;i++ ){
               // System.out.print(temp[i][j]+" ");
            }

            System.out.println();
        }
        printspiral(temp);

    }
}
