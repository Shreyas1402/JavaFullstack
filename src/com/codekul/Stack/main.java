package com.codekul.Stack;

import java.util.ArrayList;
import java.util.Stack;

 class PreviousGreater {
    public ArrayList<Integer> Greater(int arr[], int n){
        Stack<Integer>s =new Stack<>();
        ArrayList<Integer> A=new ArrayList<>();
        s.add(arr[0]);
       A.add(-1);
        for(int i=1;i<n;i++){
            while(s.isEmpty()==false&&s.peek()<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                A.add(-1);
            }
            else{
                A.add(s.peek());
            }
            s.add(arr[i]);
        }

    return A;
    }

}

class Nextgreater{
     public ArrayList<Integer> nextG(int arr[],int n){
         Stack<Integer> s=new Stack<>();
         ArrayList<Integer>A=new ArrayList<>();
         Stack<Integer>S=new Stack<>();
         s.add(arr[n-1]);
         A.add(-1);
         for(int i=n-2;i>=0;i--){
             while(s.isEmpty()==false&&s.peek()<=arr[i]){
                 s.pop();
             }
             if(s.isEmpty()){
                 A.add(-1);
                 S.add(-1);
             }
             else{
                 A.add(s.peek());
                 S.add(s.peek());
             }
             s.add(arr[i]);


         }
         System.out.println(S);
         return A;
     }
    }

    class previousSmaller{
     public ArrayList<Integer> prevSmaller(int arr[],int n){
         Stack<Integer>S=new Stack<>();
         ArrayList<Integer> A=new ArrayList<>();
         S.add(arr[0]);
         A.add(-1);
         for(int i=1;i<n;i++){
             while(S.isEmpty()==false&&S.peek()>=arr[i]){
                 S.pop();
             }
             if(S.isEmpty()){
                 A.add(-1);
             }
             else{
                 A.add(S.peek());
             }
             S.add(arr[i]);
         }
         return A;
     }
    }

public class main{
    public static void main(String[] args) {
        PreviousGreater g=new PreviousGreater();
        int arr[]={15,10,18,12,4,6,2,8};
        //System.out.println( g.Greater(arr, arr.length));

        Nextgreater N=new Nextgreater();
       // System.out.println(N.nextG(arr, arr.length));

        previousSmaller p=new previousSmaller();
        System.out.println(p.prevSmaller(arr, arr.length));

    }
}
