package com.codekul.Arrays;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        ArrayList<Integer> d=new ArrayList<>();

      int  a[]={1,2,3,4,5,6};

        b.add(1);
        b.add(2);b.add(3);b.add(4);b.add(5);
        c.add(6);c.add(7);c.add(8);c.add(9);
        A.add(b);
        A.add(c);
        A.add(b);
        A.add(c);
        b.removeAll(b);


        System.out.println(A);
        System.out.println( A.get(1).get(0));
        System.out.println(A.size());
    }
}
