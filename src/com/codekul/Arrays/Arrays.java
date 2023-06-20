package com.codekul.Arrays;

public class Arrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int temp[];
        int i=1;
        int size=23;

        if(i>0){
            temp=new int[size*2];
        }

        System.out.println(arr.length);

        for(int j=0;j< arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
