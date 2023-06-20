package com.codekul.Recursion;



public class Practice {

    public void sort(int arr[]) {

        int i = 0;

        int j;
        for (i = 0; i < arr.length; i++) {
            int min = i;
            for (j = 1 + i; j < arr.length-1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[j];
                arr[j] = arr[min];
                arr[min] = temp;
            }

        }
    }


    void print(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
}


class IMPl{
    public static void main(String[] args) {
        //int arr[] = {5, 4, 3, 9, 7, 2};

        Practice P=new Practice();

        System.out.println("hello");
       // P.print(arr);
        int arr[] = {5, 4, 3, 9, 7, 2};


        P.sort(arr);
        P.print(arr);
    }
}
