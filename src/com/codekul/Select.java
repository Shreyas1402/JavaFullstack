package com.codekul;

public class Select {
    public static void main(String[] args) {
        int arr[]={7,2,3,5,8,10,12,0};
        int i=0;
        int j;
        int max;
        for(i=0;i< arr.length-1;i++){
                max=i;
            for( j=i;j< arr.length;j++){
                if(arr[max]>arr[j]){
                    max=j;
                }
            }
            if(max!=i){
                int temp=arr[max];
                arr[max]=arr[i];
                arr[i]=temp;
            }
        }
        for(int m=0;m< arr.length;m++){
            System.out.print(arr[m]+" ");
        }
    }
}
