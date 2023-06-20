package com.codekul.BitMaipulation;

public class NumberToBit {

    public static void Convert(int n){
        String ans="";
        while(n>0){
            int temp=n%2;
            ans=Integer.toString(temp)+ans;
            n=n/2;
        }
        System.out.println(ans);
        kth(ans,2);
        toDecimal(ans);
    }

    public static void kth(String ans, int k){

            if(ans.charAt(ans.length()-k)=='1'){
                System.out.println(true);
            }
            else
                System.out.println(false);

    }

    public static void toDecimal(String ans){
        int n=ans.length();
        double sum=0;
        int p=0;
        for(int i=n-1;i>=0;i--){
            int d=ans.charAt(i)-'0';
            sum=sum+d*Math.pow(2,p);
            p++;
        }

        System.out.println(sum);
    }


    public static void main(String[] args) {
        Convert(8);
    }
}
