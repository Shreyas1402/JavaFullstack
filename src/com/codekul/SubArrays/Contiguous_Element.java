package com.codekul.SubArrays;

public class Contiguous_Element {

    public static void subArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){

                for(int k=i;k<j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();

            }


        }
    }
    public static int contiguous(int arr[]){
        int n= arr.length;
        int maxlen=1;
        for(int i=0;i<n;i++){
            int mn=arr[i];int mx=arr[i];
            for(int j=i+1;j<n;j++) {

                mn = Math.min(mn, arr[j]);
                mx = Math.max(mx, arr[j]);


                if ((mx - mn) == j - i) {
                    maxlen = Math.max(maxlen, mx - mn +1);
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        int arr[]={10,12,11};
        int y=contiguous(arr);
        System.out.println(y);
      //  subArray(arr);

    }
}
