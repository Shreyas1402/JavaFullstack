package com.codekul.Recursion;

import java.util.ArrayList;

public class Sussequence_Sum {

    public static void check(int []arr,ArrayList<Integer>A,int index,int sum,int k){
        if(index>= arr.length) {
            if (sum == k) {
                System.out.println(A);
            }
            return;
        }

        sum+=arr[index];
        A.add(arr[index]);
        check(arr,A,index+1,sum,k);
         sum-=arr[index];
        A.remove(A.size()-1);

        check(arr,A,index+1,sum,k);
    }

    public static void check1(int []arr,ArrayList<Integer>A,int index,int sum,int k){
        if(index>= arr.length) {
            return;
        }
            if (sum == k) {
                System.out.println(A);
            }


        A.add(arr[index]);
        check(arr,A,index+1,sum+arr[index],k);
        A.remove(A.size()-1);
        check(arr,A,index+1,sum,k);
    }
    public static void check2(int []arr,ArrayList<Integer>A,int index,int sum,int k){
        if(index>= arr.length) {
            return;
        }
        if (sum == k) {
            System.out.println(A);
        }


        check(arr,A,index+1,sum,k);
        A.add(arr[index]);
        check(arr,A,index+1,sum+arr[index],k);

    }

    public static void main(String[] args) {
        int arr[]={1,2,1};
        ArrayList<Integer>A=new ArrayList<>();
        check2(arr,A,0,0,2);
    }
}
