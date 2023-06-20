package com.codekul.Sliding_Window;

import java.util.ArrayList;

public class Largest_Sum {

    public static int  subarray(int arr[],int k){
        ArrayList<Long>A=new ArrayList<>();
        //A.

        int i=0;
        int j=0;
        int max=0;
        int sum=0;
        while(j<arr.length){

            if(j-i+1<k){
                sum=sum+arr[j];
                j++;
            }
            else if(j-i+1==k){
                if(max<sum) {
                    max = sum;
                }
                sum=sum+arr[j];
                j++;
                sum=sum-arr[i];
                i++;


            }
            }

        return max;
        }

    public static void main(String[] args) {
        int arr[]={2,5,1,8,9,1};
        int k=3;
      int c=  subarray(arr,k);
        System.out.println(c);
    }
    }

