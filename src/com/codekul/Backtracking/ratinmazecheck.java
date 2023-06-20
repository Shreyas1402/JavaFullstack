package com.codekul.Backtracking;

public class ratinmazecheck {
    public static boolean Ratin(int maze[][]) {
        int n= maze.length;
        int path[][]=new int[n][n];
        return solve(maze,0,0,path);

    }
    public static boolean solve(int maze[][],int i,int j,int path[][]){
        int n=maze.length;
        if(i<0||i>=n||j<0||j>=n||maze[i][j]==0||path[i][j]==1){
            return false;
        }
        path[i][j]=1;
        if(i==n-1&&j==n-1){
            return true;
        }
        // traverse the array
        //top:
     boolean c=   solve(maze,i-1,j,path);
        boolean a= solve(maze,i,j+1,path);
      boolean d=  solve(maze,i+1,j,path);
       boolean e= solve(maze,i,j-1,path);

        return c&&a&&d&&e;
    }


    public static void main(String[] args) {
        int maze[][]={{1,1,0},{1,1,1},{0,1,1}};
        boolean c= Ratin(maze);
        System.out.println(c);
        // printpath(maze);
    }
}

