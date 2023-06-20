package com.codekul.Recursion;

import java.util.Comparator;
import java.util.HashMap;

public class Sorting {
    public static void Bubblesort(int arr[], int n) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {               // (j loop)
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        Bubblesort(arr, n - 1); // (i loop)
    }

    public static void SelectionSort(int arr[], int i) {
        if (i == arr.length) {
            return;
        }
        int min = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[min] > arr[j]) {
                min = j;
            }
        }
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;

        SelectionSort(arr,i+1);

    }



    public static void main(String[] args) {
        int arr[]={2,3,1,33,5};
        //SelectionSort(arr,0);
        Bubblesort(arr, arr.length);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");

        }

        };
    }

