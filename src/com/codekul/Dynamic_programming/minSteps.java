package com.codekul.Dynamic_programming;

public class minSteps {
    public static int min(int n,int dp[]){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 0;
        }
        int ans1=0 ;
        if(dp[n-1]==-1){
            ans1=min(n-1,dp);
            dp[n-1]=ans1;
        }
        else{
            dp[n-1]=ans1;
        }
        int ans2=Integer.MAX_VALUE;
        if(dp[n/2]==-1){
            ans2=min(n/2,dp);
            dp[n/2]=ans2;
        }
        else {
            ans2=dp[n/2];
        }
        int ans3=Integer.MAX_VALUE;
        if(dp[n/3]==-1){
            ans3=min(n/3,dp);
            dp[n/3]=ans3;
        }
        else{
            ans3=dp[n/3];
        }
        int myAns=1+Math.min(ans1,Math.min(ans2,ans3));
        return myAns;
    }

    public static void main(String[] args) {
        int n=10;
        int dp[]=new int[n+1];
        for(int i=0;i< dp.length;i++){
            dp[i]=-1;
        }
        System.out.println(min(n,dp));
    }
}
