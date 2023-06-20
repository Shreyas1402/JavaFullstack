package com.codekul.Recursion;

public class FrogJumps {
    static int ans=Integer.MAX_VALUE;
    public static void Jumps(int energy[],int n,int pow){
        if(n==0){
            ans=Math.min(ans,pow);
            return;
        }
        Jumps(energy,n-1,pow+Math.abs(energy[n]-energy[n-1]));
        if(n>1){
            Jumps(energy,n-2,pow+Math.abs(energy[n]-energy[n-2]));
        }
    }

    public static void main(String[] args) {
        int energy[]={30,10,60,10,60,50};
        //int ans=0;
        Jumps(energy,energy.length-1,0);

        System.out.println(ans);
    }
}
