package com.codekul.SubArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Gratest_contigious_subarrayofk {
    /*
    Given an array arr[] of integers and an integer K, the task is to find the greatest contiguous sub-array of size K.
    Sub-array X is said to be greater than sub-array Y if the first non-matching element in both the sub-arrays has a greater
    value in X than in Y.
     */

    public static void check(int arr[],int n,int k){
        ArrayList<ArrayList<Integer>>A=new ArrayList<>();
        for(int i=0;i<=n-k;i++){
           ArrayList<Integer> B=new ArrayList<>();
            for(int j=i;j<i+k;j++){
                B.add(arr[j]);
            }
                 A.add(B);
        }
        Comparator<ArrayList<Integer>> com =new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                if(o1.get(0)<o2.get(0)){
                    return 1;
                }
                else
                    return -1;
            }
        };

        Collections.sort(A,com);
        System.out.println(A);

        System.out.println(A.get(0));

    }
    public static void main(String[] args) {

        int arr[]={1,4,2,3,5};
        check(arr, arr.length, 4);
    }
}
