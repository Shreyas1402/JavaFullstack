package com.codekul.SubArrays;

import java.util.HashMap;

public class longest_with_0_1 {
    //naive

    public static void Naive(int arr[],int n){
        int maxi=0;
        int j=0;
        for(int i=0;i<n;i++){
            int c1=0;
            int c0=0;
            for( j=i;j<n;j++){
                if(arr[j]==0){
                    c0++;
                }
                else{
                    c1++;
                }
                if(c1==c0){
                    maxi=Math.max(maxi,c0+c1);
                }
            }

        }
        System.out.println(maxi);
    }

    public static void Efficient(int arr[],int n){
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==0){
                maxi=i+1;
            }
            if(map.containsKey(sum)){
                int index=map.get(sum);
                maxi=Math.max(maxi,i-index);
            }
            else{
                map.put(sum,i);
            }
        }
        System.out.println(maxi);
    }

    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,0,0};
        Naive(arr, arr.length);
        Efficient(arr, arr.length);

    }
}
