package com.codekul.Backtracking;

public class RAT {
    static int sol[][]=new int[3][3];

    public static boolean isSafe(int i,int j,int n,int arr[][]){
        if(i<n&&j<n&&arr[i][j]==1){
            return true;
        }
        return false;

    }
    public static void check(int arr[][],int i,int j,int n){

        if(i==n-1&&j==n-1){
            sol[i][j]=1;
            for(int l=0;l<n;l++){
                for(int r=0;r<n;r++){
                    System.out.print(arr[l][r]+" ");
                }
                System.out.println();
            }
            //System.out.println("true");
        }
        if (isSafe(i,j,n,arr)) {
            sol[i][j]=1;
            check(arr, i + 1, j, n);
            check(arr, i, j + 1, n);
        }

    }

    public static void main(String[] args) {
        int arr[][]={{1,0,0},{1,1,0},{0,1,1}};
        check(arr,0,0,3);
    }
}
