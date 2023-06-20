package com.codekul.Recursion;

import java.util.ArrayList;

public class Combination_SUM {

    public static void Combination(ArrayList<Integer>A,int arr[],int index,int sum){
        if(index> arr.length-1) {


            return;

        }
        if (sum == 0) {
            System.out.println(A);
            //  A=new ArrayList<>();

        }


        if(arr[index]<=sum) {
            A.add(arr[index]);
            Combination(A, arr, index, sum -= arr[index]);
            A.remove(A.size() - 1);
        }
            Combination(A, arr, index + 1, sum);

    }

    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        ArrayList<Integer>A=new ArrayList<>();

        Combination(A,arr,0,5);

        //System.out.println();
    }
}
