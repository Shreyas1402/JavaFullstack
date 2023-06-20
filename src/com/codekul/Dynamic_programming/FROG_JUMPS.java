package com.codekul.Dynamic_programming;

import java.util.Arrays;

public class FROG_JUMPS {
    static int left=Integer.MAX_VALUE;
    static int right=Integer.MAX_VALUE;


    public static int Memoization(int dp[],int n,int energy[]){
        if(n<0){
            return Integer.MAX_VALUE;
        }
        if(n==0){
            return 0;
        }
        if(dp[n]==-1){
             left= Memoization(dp,n-1,energy)+Math.abs(energy[n]-energy[n-1]);
             if(n>1)
             right=Memoization(dp,n-2,energy)+Math.abs(energy[n]-energy[n-2]);
             dp[n]=Math.min(left,right);
        }
        return dp[n];
    }
    public static int Tabulation(int dp[],int energy[],int n){
        dp[0]=0;
        dp[1]=Math.abs(energy[1]-energy[0]);
        for(int i=2;i<=n;i++){
            int prev1=dp[i-1]+Math.abs(energy[i]-energy[i-1]);
            int prev2=dp[i-2]+Math.abs(energy[i]-energy[i-2]);

            dp[i]=Math.min(prev1,prev2);
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int energy[]={30,10,60,10,60,50};
        int dp[]=new int[energy.length];
        Arrays.fill(dp,-1);
        //int ans=0;
        System.out.println( Memoization(dp,dp.length-1,energy));

        System.out.println( Tabulation(dp,energy,dp.length-1));

      //  System.out.println(ans);
    }
}
