package com.codekul.Search_Algorithims;

public class GFGPROB {
    public static int search(int arr[],int n,int x){

        int low=0;
        int high=n-1;

        while(low<=high){

            int mid= (low+high)/2;

            if(arr[mid]>x){
                high=mid-1;
            }
            else {
                if(arr[mid]<=x&&arr[mid+1]>x){
                    return mid;

                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int arr[]=new int[42];
        int m=71;
        for(int i=0;i<42;i++){
            arr[i]=m;
            m++;
        }
        System.out.println( search(arr,42,110));
    }
}
