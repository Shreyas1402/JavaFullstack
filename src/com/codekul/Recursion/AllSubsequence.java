package com.codekul.Recursion;

import java.util.ArrayList;

public class AllSubsequence
{
   static ArrayList<Integer>A=new ArrayList<>();
    public static void printAllSubsequence(int arr[],int n,int index){
        if(index>=n){
            System.out.println(A);
            return;
        }
        A.add(arr[index]);
        printAllSubsequence(arr,n,index+1);
        A.remove(A.size()-1);
        printAllSubsequence(arr,n,index+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,4};
        printAllSubsequence(arr, arr.length, 0);
    }
}
