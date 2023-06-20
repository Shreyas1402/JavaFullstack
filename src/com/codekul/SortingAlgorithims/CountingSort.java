package com.codekul.SortingAlgorithims;

public class CountingSort {

    public static void countingsort(int arr[],int n,int k){
        int count[]=new int [n];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        for(int i=1;i<n;i++){
            count[i]=count[i]+count[i-1];//number of elements smaller than or equal to that element
        }
        int output[]=new int [n];
        for (int i=0;i<n;i++){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }

    }
    public void countingsortnaive(int arr[],int n){
        int count[]=new int [n];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int in=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<count[i];j++) {
                arr[in]=i;
                in++;
            }
        }
    }


    public static void print(int arr[],int n){
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={1,3,1,4,3,1,2,0,1,1};
       // countingsort(arr, arr.length,5);
       // print(arr, arr.length);
        CountingSort c=new CountingSort();

        c.countingsortnaive(arr, arr.length);
        print(arr, arr.length);
    }
}
