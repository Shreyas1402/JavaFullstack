package com.codekul.SortingAlgorithims;

import java.util.ArrayList;

public class UnionOfTwoArrays {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> A=new ArrayList<>();
        int i=0;
        int j=0;

        while(i<n&&j<m){
            if(i>0&&arr1[i]==arr1[i-1]){
                i++;
                continue;
            }
            if(j>0&&arr2[j]==arr2[j-1]){
                j++;
                continue;
            }

            if(arr1[i]>arr2[j]){
                A.add(arr2[j]);
                j++;
            }

          else if(arr1[i]<arr2[j]){
                A.add(arr1[i]);
                i++;
            }

          else if(arr1[i]==arr2[j]){
                A.add(arr1[i]);
                i++;
                j++;
            }

        }

        while(i<n){
            A.add(arr1[i]);
            i++;
        }
        while(j<m){
            A.add(arr2[j]);
            j++;
        }


        return A;
    }

    public static void main(String[] args) {
        int a[]={1,4,18,19,19,28,29,32,35,35,39,39,44,49,49,50,50};
        int b[]={8,34};
        System.out.println( findUnion(a,b, a.length, b.length));
    }
}

