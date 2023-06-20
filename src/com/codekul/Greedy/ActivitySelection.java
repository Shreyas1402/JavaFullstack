package com.codekul.Greedy;

import java.util.*;

public class ActivitySelection {
    public static void MaxPossible(ArrayList<ArrayList<Integer>>A) {
        System.out.println(A);
        ArrayList<Integer> temp = new ArrayList<>();



    }




    public static void create(ArrayList<ArrayList<Integer>>A,int x,int y){
        ArrayList <Integer>B=new ArrayList<>();
        B.add(x);
        B.add(y);
        A.add(B);

    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>A=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF OPERATIONS");
        int n= s.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("ENTER STARTING TIME");
            int x = s.nextInt();
            System.out.println("ENTER ENDING TIME");
            int y = s.nextInt();
            create(A,x,y);
        }

        MaxPossible(A);
    }

}
