package com.codekul.Backtracking;

public class Sudoku_solver {
   static int board[][]={{1,0,3,0},{0,0,2,1},{0,1,0,2},{2,4,0,0}};
    public static boolean isSafe(int board[][],int row,int col,int val,int n){

        for(int i=0;i<n;i++){
            if(board[row][i]==val){
                return false;
            }
        }
        for(int i=row;i>=0;i--){
            if(board[row][i]==val){
                return false;
            }
        }
        for(int i=0;i<n;i++){
            if(board[i][col]==val){
                return false;
            }
        }
        for(int i=col;i>=0;i--){
            if(board[i][col]==val){
                return false;
            }
        }

        return true;
    }

    public static void SudokuSolver(int board[][],int rows,int col,int n){



        if(rows==n){
            return;
        }
        if(col==n){
            return;
        }

        if(board[rows][col]==0){
            for(int i=1;i<=n;i++){
                if(isSafe(board,rows,col,i,n)){
                    board[rows][col]=i;
                }
            }
        }
        SudokuSolver(board,rows+1,col,n);
        SudokuSolver(board,rows,col+1,n);





    }

    public static void print(int board[][],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        SudokuSolver(board,0,0,4);

        print(board,4);
    }
}
