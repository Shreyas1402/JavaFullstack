package com.codekul.Self;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class practice {
    public static void main(String[] args) {
        int n=5;
        ArrayList<Integer> a=new ArrayList<>(n);
        for(int i=1;i<=n;i++){
            a.add(i);
        }
        System.out.println(a);

        a.remove(3);
        System.out.println(a);
       ArrayList<Integer> c=new ArrayList<>(n);
        c.add(1);
        c.add(5);
        c.add(6);
        c.add(3);

        a.retainAll(c);
        System.out.println("retained"+a);
        System.out.println("retained"+c);


        ArrayList<String> b=new ArrayList<>(5);
         b.add("hello");
       b.add(1,"shreyas"+ " pappu"+" hshshjaj");

        System.out.println(b);
        int d =  b.size();
        System.out.println(d);

        System.out.println("**************** vector *************");

        Vector<Integer> A =new Vector<>(3,1);

        A.add(1);
        A.add(2);



        int e=A.size();
        System.out.println(A);
        System.out.println(e);


    }


}

