package com.codekul.Self;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Small_Large_Sum {
    public void sum(int arr[]){
        int n=arr.length;
        System.out.println(n);
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even =new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(i%2==0) {
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);
      int e=even.size();
      int o=odd.size();
      int sum=even.get(e-2)+odd.get(o-2);
        System.out.println(sum);


    }
}
class impl2{
    public static void main(String[] args) {
        Small_Large_Sum S=new Small_Large_Sum();
        int arr[]={4,0,7,9,6,4,2};
        S.sum(arr);
    }
}
