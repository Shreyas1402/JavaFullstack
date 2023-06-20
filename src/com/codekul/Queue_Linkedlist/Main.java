package com.codekul.Queue_Linkedlist;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<Integer>();



        Queue_Linkedlist Q = new Queue_Linkedlist();
        Q.enqueue(1);
        Q.enqueue(12);
        Q.enqueue(14);
        Q.enqueue(13);
        Q.enqueue(15);
        System.out.println(Q.dequeue());
        System.out.println(Q.dequeue());
        Q.dequeue();
        Q.dequeue();
        Q.dequeue();
        System.out.println(Q.dequeue());

        System.out.println(Q.isEmpty());
       // System.out.println(Q.getrear());
        Q.print();





    }
}
