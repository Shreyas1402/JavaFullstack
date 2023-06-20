package com.codekul.Sliding_Window;

public class Largest_Subarray{
    static int max=0;
    public static int find(int arr[],int j ,int k){
        int sum=0;
        int i=0;
        int m=j;
        if(k>=arr.length+1){
            return max;
        }
        for( i=j;i<k;i++){
            sum=sum+arr[i];
        }
        if(sum>max){
            max=sum;
        }


        return find(arr,m+1,k+1);
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,6,10,1,2,4,50};
        int j=0;
        int k=3;
        System.out.println( find(arr,j,k));

    }
}
