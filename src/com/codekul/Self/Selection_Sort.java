package com.codekul.Self;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] a = {20, 35, -15, 7, 55, 1, -22};
        for (int last = a.length; last>=0; last--) {
            int largest = 0;
            for (int i = 1; i <= last; i++) {
                if (a[i] > a[largest]) {
                    largest = i;
                }
                swap(a,largest,last);
            }

        }
    }

    public static void swap(int b[],int i,int j) {
        if(i==j){
            return;
        }
        int temp=b[i];
        b[i]=b[j];
        b[j]=temp;

    }
}
