package com.codekul.SortingAlgorithims;


import java.util.ArrayList;

public class BubbleSort {
   static void BubbleSort(int arr[]){
       int n=arr.length;
       for(int i=0;i<n-1;i++){
           for(int j=0;j<n-i-1;j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }

   }
    static  void Print(int arr[]){
       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }
   }




       public static void main(String[] args) {
           int arr[]={80,7,4,6,2,5};
            BubbleSort(arr);
            Print(arr);

           ArrayList<Integer>A=new ArrayList<>();
           A.add(5);
           if(A.contains(arr[2])){
               System.out.println("hello");
           }


       }
   }

