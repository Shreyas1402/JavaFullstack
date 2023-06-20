package com.codekul.Backtracking;

public class AllPaths {
    public static void Ratin(int maze[][]) {
        int n= maze.length;
        int path[][]=new int[n][n];
         solve(maze,0,0,path);

    }
    public static void solve(int maze[][],int i,int j,int path[][]){
        int n=maze.length;
        if(i<0||i>=n||j<0||j>=n||maze[i][j]==0||path[i][j]==1){
            return ;
        }
        path[i][j]=1;
        if(i==n-1&&j==n-1){
            for(int r=0;r<n;r++){
                for(int c=0;c<n;c++){
                    System.out.print(path[r][c]+" ");
                }
                System.out.println();

            }
            System.out.println();
            path[i][j]=0;

            return;
        }
        // traverse the array
        //top:
        solve(maze,i-1,j,path);

        //right:
        solve(maze,i,j+1,path);

        //down
        solve(maze,i+1,j,path);
        //left
        solve(maze,i,j-1,path);
        path[i][j]=0;


    }

    public static void main(String[] args) {
        int maze[][]={{1,1,0},{1,1,1},{0,1,1}};
        Ratin(maze);
    }
}
