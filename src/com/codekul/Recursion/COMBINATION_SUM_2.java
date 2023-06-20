package com.codekul.Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class COMBINATION_SUM_2 {

    public static void Combi(int arr[],ArrayList<ArrayList<Integer>>Ans,ArrayList<Integer>temp,int index,int target){
        if(index==arr.length) {
            if (target == 0) {
                System.out.println(temp);

            }
            return;
        }

        if(arr[index]<=target){
            temp.add(arr[index]);
            target-=arr[index];
            Combi(arr,Ans,temp,index+1,target);
            temp.remove(temp.size()-1);
        }
        Combi(arr,Ans,temp,index+1,target);
    }

    static ArrayList<String>A=new ArrayList<>();
    public static void StringP(String arr,int index,String s){
        if(index==arr.length()){
            A.add(s);
            return;
        }
        StringP(arr,index+1,s);
        StringP(arr,index+1,s+=arr.charAt(index));
    }

    public static void Subsequence(int arr[],int index,ArrayList<Integer>A){
        if(index== arr.length){
            System.out.println(A);
            return;
        }
        A.add(arr[index]);
        Subsequence(arr,index+1,A);
        A.remove(A.size()-1);
        Subsequence(arr,index+1,A);
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>Ans=new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer>temp=new ArrayList<>();
        int arr[]={1,1,1,2,2};
      //  Collections.sort();

        Arrays.sort(arr);

        //Combi(arr,Ans,temp,0,4);

       // System.out.println(Ans);


       // String op="abc";
       // StringP(op,0,"");
        //System.out.println(A);

        Subsequence(arr,0,temp);

    }
}
