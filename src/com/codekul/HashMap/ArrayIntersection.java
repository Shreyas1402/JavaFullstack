package com.codekul.HashMap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntersection {
    public static void main(String[] args) {
        int arr1[]={1,2,3,1,4,1,4,5};
        int arr2[]={1,3,4,2,4,1};
        ArrayList<Integer> A=new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(i<arr1.length&&j< arr2.length){
            if(arr1[i]==arr2[j]){
                A.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(A);
    }
}
