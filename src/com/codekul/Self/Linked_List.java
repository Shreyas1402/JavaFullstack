package com.codekul.Self;

import java.util.LinkedList;

public class Linked_List{

}
 class Node{
    public int value;
    public Node next;

}

class Singlelist {
    public static void main(String[] args) {


        Node node = new Node();
        LinkedList e = new LinkedList<>();
        e.add(3);
        e.add(12);
        int a = e.size();
        e.remove(3);
        System.out.println(e);
        System.out.println(a);


    }
}
