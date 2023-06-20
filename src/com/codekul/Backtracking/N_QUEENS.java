package com.codekul.Backtracking;

public class N_QUEENS {

    public static boolean isSafe(int row,int col,int board[][],int n) {

        for (int i = col; i >= 0; i--) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }

        }
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }

        }

        return true;
    }


    public static void NQUEEN(int board[][],int column,int n){

        if(column==n){
            for (int i=0;i<5;i++){
                for(int j=0;j<5;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("true");
            System.exit(0);
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(i,column,board, n)){
                board[i][column]=1;
                NQUEEN(board,column+1,n);

            }
            board[i][column]=0;
        }

    }

    public static void main(String[] args) {
        int board[][]=new int [5][5];

        NQUEEN(board,0,5);



    }
}
