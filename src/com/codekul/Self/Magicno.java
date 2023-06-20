package com.codekul.Self;

import java.util.ArrayList;

public class Magicno {
   // static ArrayList<Integer>A=new ArrayList<>();
    static int sum1=0;
    public static int find(int x,int y){
        if(x>y){
            return sum1;
        }
        int m=x;
        int max=x%10;
        int sum=0;

        while(x!=0&&x<=y){
            int i=x%10;
            if(i>max){
                max=i;
            }
            sum=sum+i;
            x=x/10;
        }
        if(max==sum-max){
            sum1=sum1+m;

        }
        find(m+1,y);

        return sum1;
    }

    public static void main(String[] args) {
        int x=10;
        int y=100;
        int c=find(x,y);
        System.out.println(c);
    }
}
