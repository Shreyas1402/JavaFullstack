package com.codekul.Self;

import com.codekul.Linked_list_problems.Linked_list;

import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class qwqeqrqt {
    public static void main(String[] args) {
        AbstractCollection<Integer> A =new LinkedList<>();
        A.add(1);
        A.add(3);
        A.add(1);
        A.add(3);
        A.add(1);
        A.add(3);
        AbstractCollection<Integer> B=new HashSet<>();
        B.addAll(A);
        System.out.println(B);
        Vector<String> C=new Vector<>();
        C.add(" qqqq");
        C.add(" qqqq");
        C.add(" qqqq");
        C.add(" qqqq");

        Vector<String> D=new Vector<>();
        D.addAll(C);
        System.out.println(C);
        System.out.println(D.containsAll(C));


    }
}
