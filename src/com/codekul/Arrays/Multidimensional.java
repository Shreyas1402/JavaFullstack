package com.codekul.Arrays;

import java.util.Arrays;

public class Multidimensional {
    int arr[][]=null;
    int arr1[][];
    public Multidimensional(int row,int col) {
        this.arr=new int[row][col];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }

    }
    public void Insert(int row,int col,int val){
        if(arr[row][col]==Integer.MIN_VALUE){
            arr[row][col]=val;

        }
        else{
            System.out.println("THE SPACE IS FULL");
        }
    }

    public void Access(int val){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                if(arr[i][j]==val){
                    System.out.println("The element is at "+i+ " , "+j);
                }
            }

            }

    }

    public void Traversal(){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }

    public void delete(int row,int col){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[0].length;j++) {
                if(arr[i][j]==arr[col][row]){

                }
            }
            }

    }


}
class Impl{
    public static void main(String[] args) {
        Multidimensional M=new Multidimensional(3,3);
            M.Insert(0,0,10);
            M.Insert(0,1,20);
            M.Insert(0,2,30);
            M.Insert(1,0,40);
            M.Insert(1,1,50);
            M.Insert(1,2,60);
            M.Insert(2,0,10);
            M.Insert(2,1,10);

            M.Traversal();
            M.Access(60);
    }
}