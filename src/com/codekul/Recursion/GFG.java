package com.codekul.Recursion;

import java.util.ArrayList;

public class GFG {

    public static void Sub(ArrayList<ArrayList<Integer>>B,ArrayList<Integer> A,ArrayList<Integer> C,int index,int n){

        if(index>=n){

            B.add(C);
            return;
        }
        C.add(A.get(index));
        Sub(B,A,C,index+1,n);
        C.remove(C.size()-1);
        Sub(B,A,C,index+1,n);

       // System.out.println(B);
    }
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        ArrayList<Integer> C=new ArrayList<>();



        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
       //   B.add(C);
        int n=A.size();
        Sub(B,A,C,0,n);


        return B;
    }

    public static void main(String[] args) {

        String s="leelklkel";
        System.out.println(s.substring(0));

        ArrayList<Integer>A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        System.out.println( subsets(A));
    }
}
