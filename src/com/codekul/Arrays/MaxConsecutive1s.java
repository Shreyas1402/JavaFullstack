package com.codekul.Arrays;

public class MaxConsecutive1s {
    // in a binary array;

    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0,1,1,1,1,1,1,0,1,1,1,1};
        int res=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                res=Math.max(res,count);
                count=0;

            }
            else{
                count++;
            }
        }

        System.out.println(res);
    }
}
