package com.codekul.SortingAlgorithims;

public class MergeSortNew {


    public static void MergeSort(int arr[],int l,int m,int r){

        int left[]=new int [m-l+1];
        int right[]=new int [r-m];

        for(int i=0;i<left.length;i++){
            left[i]=arr[l+i];
        }
        for(int i=0;i<right.length;i++){
            right[i]=arr[m+1+i];
        }
        int i=0;int j=0; int k=l;
        while(i<left.length&&j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
    }
    public static void merge(int arr[],int l,int r) {

        if (l < r) {
            int m = (l + r) / 2;
            merge(arr, l, m);
            merge(arr, m + 1, r);
            MergeSort(arr, l, m, r);
        }

    }


    public static void main(String[] args) {
        int arr[]={23,45,2,4,67,89,8,77,11,12,177};
        merge(arr,0, arr.length-1);
        
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
