package com.codekul.Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Ceilonleft {
    public static ArrayList<Integer> find(int arr[],int n){
        ArrayList<Integer>A=new ArrayList<>();
        TreeSet<Integer>S=new TreeSet<>();
        S.add(arr[0]);
        A.add(-1);
        for(int i=1;i<n;i++){
            if(S.ceiling(arr[i])==null){
                A.add(-1);
            }
            else{
                A.add(S.ceiling(arr[i]));
            }
            S.add(arr[i]);
        }


        return A;
    }

    public static void main(String[] args) {
        int arr[]={2,8,30,15,25,12};

        System.out.println(find(arr, arr.length));
    }
}
