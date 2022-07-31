package com.codekul.Queue;

public class Main {
    public static void main(String[] args) {


        Queue Q = new Queue(5);
        boolean a=Q.isFull();
        System.out.println(a);
        boolean b=Q.isEmpty();
        System.out.println(b);
        Q.Enqueue(4);
        Q.Enqueue(3);
        Q.Enqueue(5);
       int c= Q.Dequeue();
        System.out.println(c);
        int f=Q.Dequeue();
        System.out.println(f);
        int d=Q.Dequeue();
        System.out.println(d);
        int e=Q.Dequeue();
        System.out.println(e);
        Q.enqueue(5);
        Q.enqueue(3);
        Q.enqueue(5);
        Q.enqueue(5);
        Q.enqueue(5);






    }
}
