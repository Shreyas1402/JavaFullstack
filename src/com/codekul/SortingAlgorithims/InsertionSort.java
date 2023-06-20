package com.codekul.SortingAlgorithims;

public class InsertionSort {

    public void Insertion(int arr[]){
        for(int i=1;i< arr.length;i++){
            int temp=arr[i],j=i;
            while(j>0&&arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;

        }
    }
    public void print(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class main{
    public static void main(String[] args) {
        InsertionSort I=new InsertionSort();
        int arr[]={5,8,3,4,2,9,1};
        I.Insertion(arr);
        I.print(arr);
    }
}
