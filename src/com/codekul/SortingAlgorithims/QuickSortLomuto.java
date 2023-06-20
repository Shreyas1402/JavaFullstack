package com.codekul.SortingAlgorithims;

public class QuickSortLomuto {

    static void quickSort(int arr[], int low, int high) {

        if (low <high) {
            int p = partition(arr, low, high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int p = arr[high ];
        int i = low - 1;
        for (int j =low; j<=high - 1;j++) {
            if (arr[j] < p) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }


        int t = arr[i+1];
        arr[i+1]= arr[high];
        arr[high] = t;



        return i + 1;
    }

    public static void print(int arr[]){

        for (int j=0;j< arr.length;j++){
            System.out.print(arr[j]+" ");
        }

    }

    public static void main(String[] args) {
        int arr[]={4,1,3,9,7};
        quickSort(arr,0, arr.length-1);

        print(arr);
    }
}
