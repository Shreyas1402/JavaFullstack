package com.codekul.Divide_and_conquer;

public class House_robber {
    public static int rob(int house[],int index){
        if(index>=house.length){
            return 0;
        }
        int currhouse=house[index]+rob(house, index+2);//
        int skip=rob(house,index+1);

        return Math.max(currhouse,skip);
    }

    public static void main(String[] args) {
        int arr[]={6,7,30,1};
       int c= rob(arr,0);
        System.out.println(c);
    }
}

