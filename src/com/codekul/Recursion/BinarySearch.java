package com.codekul.Recursion;

public class BinarySearch {

    public static int search(int arr[],int low,int high,int x){
        int mid=(low+high)/2;

        if (low>high){
            return -1;
        }
        if(arr[mid]==x){
            return mid;
        }
        if(arr[mid]>x){
            return search(arr,low,mid-1,x);
        }
        else

            return search(arr,mid+1,high,x);


    }
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5,7,8,9,11};
        System.out.println( search(arr,0, arr.length-1,6));
    }
}
