package com.codekul.SortingAlgorithims;

public class MergeSort {

    public void merge(int arr[],int left,int mid,int right){
        int leftA[] = new int[mid -left+2];
        int rightA[]=new int [right-mid+1];

        for(int i=0;i<=mid -left;i++){
            leftA[i]=arr[left+i];
        }
        for(int i=0;i<right-mid;i++) {
            rightA[i] = arr[mid+i+1];
        }
        leftA[mid-left+1]=Integer.MAX_VALUE;
        rightA[right-mid]=Integer.MAX_VALUE;
        int i=0,j=0;
        for(int k=left;k<=right;k++){
            if(leftA[i]<=rightA[j]){
                arr[k]=leftA[i];
                i++;
            }
            else{
                arr[k]=rightA[j];
                j++;
            }
        }
    }
    public void mergesort(int arr[],int left,int right){
        if (right>left){
            int m=(left+right)/2;
                mergesort(arr,left,m);
                mergesort(arr,m+1,right);
                merge(arr,left,m,right);
        }
    }
    public void print(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class Main2{
    public static void main(String[] args) {
        MergeSort M=new MergeSort();
        int arr[]={66,44,63,8,9,7,6};
        M.mergesort(arr,0, arr.length-1);
        M.print(arr);
    }

}
