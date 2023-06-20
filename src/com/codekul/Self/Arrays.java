package com.codekul.Self;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
      int arr[][]={{1,2,3,1},{4,5,6,2},{7,8,9,3}};
      int m= arr.length;
      int n=arr[0].length;
      int max=0;
      int min=Integer.MAX_VALUE;
      int k=0;
      int l=0;
      for(int i=0;i<n;i++){
          int sum=0;
          for(int j=0;j<m;j++){
              sum+=arr[j][i];
          }
          if(sum>max){
              k=i;
              max=sum;
          }
          if(sum<min){
              l=i;
              min=sum;
          }
      }
        System.out.println("MAX SUM IS: "+max+" at column: "+ k);
        System.out.println("MIN SUM IS: "+min+" at column: "+ l);
    }
}

