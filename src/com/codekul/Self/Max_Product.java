package com.codekul.Self;

public class Max_Product {
    int maxpro=0;

    public void max(int []arr){
        String s="";
         for(int i=0;i< arr.length;i++){
             for(int j=0;j< arr.length;j++){
                 if(arr[i]*arr[j]>maxpro){
                     maxpro=arr[i]*arr[j];

                 }
                 s=Integer.toString(arr[i])+" , "+Integer.toString(arr[j]);
                 System.out.println(s);

             }
         }
        }
    }


class Main1{
    public static void main(String[] args) {
        Main1 mn=new Main1();
        int [] arr={10,20,30,40,50};
        Max_Product max=new Max_Product();
       max.max(arr);

    }
}
