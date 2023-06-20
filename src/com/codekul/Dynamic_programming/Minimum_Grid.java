package com.codekul.Dynamic_programming;

public class Minimum_Grid
{
    public static void FindMini(int i,int j,int sum,int res,int grid[][]){
        if(i==0&&j==0){
          //  System.out.println("entered");
            res=Math.min(sum,res);
            System.out.println(res);
            return;
        }
        if(i<0||j<0){
            return;
        }
        FindMini(i,j-1,sum+=grid[i][j],res,grid);

        FindMini(i-1,j,sum+=grid[i][j],res,grid);
        //System.out.println(res);

    }
    public static void Tabulation(int grid[][]){
        int dp[][]=new int [3][3];
        dp[0][0]=grid[0][0];
        int sum=grid[0][0];
        for(int i=1;i<3;i++){
            sum+=grid[i][0];
            dp[i][0]=sum;
        }
         sum=grid[0][0];
        for(int j=1;j<3;j++){
            sum+=grid[0][j];
            dp[0][j]=sum;
        }

        for(int i=1;i<3;i++){
            for(int j=1;j<3;j++){
                int down=grid[i][j]+dp[i-1][j];
                int left=grid[i][j]+dp[i][j-1];

                dp[i][j]=Math.min(down,left);
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int grid[][]={{1,1,2},{10,5,100},{10,8,2}};
        int res=Integer.MAX_VALUE;
        int i=2;
        int j=3;
        Tabulation(grid);
      //  FindMini(i-1,j-1,0,Integer.MAX_VALUE,grid);
      //  System.out.println(res);
    }
}
