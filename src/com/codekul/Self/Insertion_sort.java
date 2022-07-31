package com.codekul.Self;

public class Insertion_sort {
    public static void main(String[] args) {
        int a[] = {20, 35, -15, 7, 55, 1, -22,};
        for (int first = 1; first < a.length; first++) {
            int newElement = a[first];
            int i;
            for (i = first; i > 0 && a[i - 1] > newElement; i--) {
                a[i] = a[i - 1];
            }
            a[i] = newElement;

        }
            for (int i = 0; i <a.length; i++)
                System.out.println(a[i]);


    }
}
