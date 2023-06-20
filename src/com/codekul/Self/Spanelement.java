package com.codekul.Self;

public class Spanelement {
    public static void calculateSpan(int price[], int n)
    {
        int arr[]=new int [n];
        arr[0]=1;
        for(int i=1;i<n;i++){
            if(price[i-1]>price[i]){
                arr[i]=1;
            }
            else{
                arr[i]=i-1;
            }

        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int price[]={ 100 ,80 ,60 ,70 ,60 ,75 ,85};
        int n=7;
        calculateSpan(price,n);
    }

}

