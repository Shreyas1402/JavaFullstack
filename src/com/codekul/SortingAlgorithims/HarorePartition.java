package com.codekul.SortingAlgorithims;

public class HarorePartition {
    public static int partition(int arr[],int low,int high){
        int p=arr[low];
        int i=low-1;
        int j=high+1;

        while(true){
            do{
                i++;
            }while (arr[i]<p);

            do{
                j--;
            }while(arr[j]>p);
            if(i>=j){
                return j;
            }
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

    }

    public static void print(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={5,7,8,2,3,4,9};
        partition(arr,0, arr.length-1);

        print(arr);
    }
}
