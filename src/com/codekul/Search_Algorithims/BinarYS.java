package com.codekul.Search_Algorithims;

public class BinarYS {

    public static int search(int arr[],int start,int end,int x){

            int mid = (start + end) / 2;

            if(start>end){
                return -1;
            }

            if (arr[mid] == x) {
                return mid;

            }
            else if (arr[mid] > x) {
                //end = mid - 1;
               return search(arr,start,mid-1,x);

            } else{
                //start = mid + 1;
                return search(arr,mid+1,end,x);

            }
            }
       // }

    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
     int b=  search(arr,0, arr.length-1, 10);
        System.out.println(b);


    }
}
