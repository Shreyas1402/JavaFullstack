package com.codekul.Recursion;

public class MergeSort {

    public static  void Merge(int arr[],int lo,int mid ,int high){
       // int mid=(lo+high)/2;
        int n1=mid-lo+1;
        int n2=high-mid;
        int right[]=new int[n1];
        int left[]=new int [n2];
        //int temp[]=new int [arr.length];
        for(int i=0;i<n1;i++){
            right[i]=arr[lo+i];
        }
        int j=0;
        for(int i=0;i<n2;i++){
            left[j]=arr[mid+i+1];
            j++;
        }
        int p=lo,r=0,l=0;
        while(r<right.length&&l<left.length){
            if(right[r]<left[l]){
                arr[p]=right[r];
                p++;
                r++;
            }
            else{
                arr[p]=left[l];
                p++;
                l++;
            }
        }

            while(l<n2){
                arr[p]=left[l];
                p++;
                l++;
            }

            while(r<n1){
                arr[p]=right[r];
                p++;
                r++;
            }


    }

    public static void MergeSort(int arr[],int lo,int high){
        if(lo>=high){
            return;
        }
            int mid=(lo+high)/2;
            MergeSort(arr,lo,mid);
            MergeSort(arr,mid+1,high);
            Merge(arr,lo,mid,high);
        }

    public static void print(int temp[]){
        for(int i=0;i< temp.length;i++)
        System.out.print(temp[i]+" ");
    }

    public static void main(String[] args) {
        int arr[]={3,4,2,1,6};
        MergeSort(arr,0, arr.length);

        for(int i:arr){
            System.out.print(i+" ");
        }

    }

}