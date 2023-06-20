package com.codekul.Self;

import java.util.Arrays;

public class Timepass {
    public static void Insertion(int arr[],int n){

        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int occurance(int a[],int n){
        Arrays.sort(a);
        int curr=1;
        int res=1;
        for(int i=1;i<n;i++){
            if(i>0&&a[i]==a[i-1]){
                curr++;
            }
            else{
                curr=1;
            }

            res=Math.max(res,curr);

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={5,3,4,2,1};
       // Insertion(arr, arr.length);
        int a[]={1,3,4,2};
        System.out.println(occurance(a,a.length));
    }
}
