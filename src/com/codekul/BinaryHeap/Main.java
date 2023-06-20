package com.codekul.BinaryHeap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap BH=new BinaryHeap(6);
        BH.Insert(2);
        BH.Insert(5);
        BH.Insert(6);
        BH.Insert(1);
        BH.Insert(23);
        BH.Insert(22);
        BH.Insert(21);
        BH.Insert(20);
        BH.print();

        BH.delete(4);
        System.out.println("after deletion");
        BH.print();


    }
}
