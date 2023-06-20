package com.codekul.Dynamic_programming;

import java.util.Arrays;

public class Grid_Paths {
  //  static int count=0;
    public static int Grid(int i,int j,int dp[][]){


            if(i==0&&j==0){
                return dp[i][j]=1;
            }

            if(i<0||j<0){
                return 0;
            }
        if(dp[i][j]==-1) {
            int right = Grid(i, j - 1, dp);
            int down = Grid(i - 1, j, dp);
            dp[i][j] = right + down;
        }
        return dp[i][j];
    }


        static int uniquePaths(int n, int m, int[][] grid) {
            if(grid[n][m]==0){
                return 0;
            }

            if(m==0&&n==0){
                return 1;
            }
            if(m<0||n<0){
                return 0;
            }

            int left=uniquePaths(n,m-1,grid);
            int up=uniquePaths(n-1,m,grid);

            return left+up;

        }

    //
    public static int Tabulation(){
        int dp[][]=new int[3][3];

      for(int i=0;i<3;i++){
          dp[i][0]=1;
      }
        for(int j=0;j<3;j++){
            dp[0][j]=1;
        }
        for(int i=1;i<3;i++){
            for(int j=1;j<3;j++){
                int up=dp[i-1][j];
                int left=dp[i][j-1];
                dp[i][j] =left+up;
                }

            }
           return dp[1][1];
        }



    public static void main(String[] args) {
        int dp[][]=new int[3][3];
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                dp[i][j]=1;
            }
        }
        dp[1][1]=0;

        //Arrays.fill();
        int c=Grid(2,2,dp);
       // System.out.println(c);
       // System.out.println(count);

        System.out.println(uniquePaths(3,3,dp));

        //System.out.println(Tabulation());
    }
}
