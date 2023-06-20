package com.codekul.SortingAlgorithims;

public class SelectionSort {
    void SelectionSort(int arr[]){

        for(int i=0;i< arr.length;i++){
            int min=i;  // with every increment the value here gets updated resulting in the swapped element not being touched.
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;              // here we get the minimum value
                }
            }
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
    void print(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class Main1{
    public static void main(String[] args) {
        SelectionSort S= new SelectionSort();
        int arr[]={8,7,6,3,4,2,1};
        S.SelectionSort(arr);
        S.print(arr);

    }
}
