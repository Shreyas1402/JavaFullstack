package com.codekul.Queue;

import java.util.ArrayList;

public class timepass {


    static ArrayList<Integer> A=new ArrayList<>();
    static void ans(int N,int I){
        if(N<=0){
            return;
        }
        else if(N==I){
            return;
        }

        A.add(N);
        ans(N-5,I);
        ans(N+5,I);
        System.out.println(A);

    }
    static ArrayList<Integer> pattern(int N) {

        ans(N, N);


        return A;
    }
    public static void main(String[] args) {
        System.out.println(pattern(16));

    }
}
