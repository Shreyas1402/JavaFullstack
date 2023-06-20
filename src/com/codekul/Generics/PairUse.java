package com.codekul.Generics;

import javax.swing.*;

public class PairUse {
    public static void main(String[] args) {
        Pair<Integer,Integer>P=new Pair<>(1,2);
        P.setPair1(11);
        P.setPair2(12);
        System.out.println(P.getPair1());
       // P.print();

        int a=10;
        int b=12;

        Pair<String,Character>Q=new Pair<>("Hello ",'c');
        Pair<Integer,Integer> P1=new Pair<>(a,b);
        Pair<Pair<Integer,Integer>,String> N=new Pair<>(P1,"I GOT THIS");
        //System.out.println( N.getPair1());
       // System.out.println( N.getPair2());
      //  N.print();

    }
}
