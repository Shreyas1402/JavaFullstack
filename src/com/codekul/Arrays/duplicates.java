package com.codekul.Arrays;

public class duplicates {
    public static void main(String[] args) {


        int l = 0;
        int[] arr = {1, 2, 3, 1, 4};
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    continue;

                } else {
                    for (l = 0; i < array.length - 1; l++) {
   //                     array[l] = arr[i];
                    }

                }
                System.out.println(array[l]);

            }


        }
    }
}

