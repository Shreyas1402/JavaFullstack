
package com.codekul.SortingAlgorithims;

public class SegregateEvenOdd {
    public static void Segregate(int arr[],int n){
        int p=arr[n-1];
        int i=-1;

        for(int j=0;j<=n-1;j++){
            if(arr[j]<p){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[n-1];
        arr[n-1]=arr[i+1];
        arr[i+1]=temp;



    }
    public static void Hoare(int arr[],int n){
        int i=-1;
        int j=n;
        while(true){
            do{
                i++;
            }while(arr[i]%2==0);
            do{
                j--;
            }while(arr[j]%2!=0);
            if(i>=j){
                return;
            }

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }

    public static void print(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={12,3,1,4,5,6,0,50};
       // Segregate(arr, arr.length);

        Hoare(arr, arr.length);


        print(arr);
    }
}
