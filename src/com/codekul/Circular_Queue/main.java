package com.codekul.Circular_Queue;

public class main {
    public static void main(String[] args) {
        CircularQueue Q=new CircularQueue(5);
        boolean b=Q.isFull();
        boolean c=Q.isEmpty();
        System.out.println(b);
        System.out.println(c);
        Q.Enqueue(4);
        Q.Enqueue(3);
        Q.Enqueue(5);

       // int a= Q.Dequeue();
      //  System.out.println(a);
       int B= Q.peek();
        System.out.println(B);


    }
}
