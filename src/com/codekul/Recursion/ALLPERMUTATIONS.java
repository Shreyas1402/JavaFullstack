package com.codekul.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ALLPERMUTATIONS {

    public static void PrintAll(int arr[], ArrayList<ArrayList<Integer>>ans,ArrayList<Integer>A,boolean freq[]){
        if(A.size()==arr.length){
            ans.add(new ArrayList<>(A));
            return;
        }
        for (int i=0;i< arr.length;i++){
        if(!freq[i]){
            freq[i]=true;
            A.add(arr[i]);
            PrintAll(arr,ans,A,freq);
            A.remove(A.size()-1);
            freq[i]=false;
        }
        }
    }

    public static char[]  swap( String s,int a,int b) {
        char ch[]=s.toCharArray();
        char temp=ch[a];
        ch[a]=ch[b];
        ch[b]=temp;

      return ch;
    }


    public static void Permutations(String S,int l,int r){
        if(l==r){
            System.out.println(S);
            return;
        }
        for(int i=l;i<r;i++){
            S=new String(swap(S,i,l));
            Permutations(S,l+1,r);
            S=new String(swap(S,i,l));

        }


    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        boolean freq []=new boolean[arr.length];
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>A=new ArrayList<>();
        String S="abc";
       Permutations(S,0,S.length());
        

    }
}
