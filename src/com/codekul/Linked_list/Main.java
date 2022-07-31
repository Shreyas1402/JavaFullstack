package com.codekul.Linked_list;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList a=new SinglyLinkedList();
        a.Create(5);
        //System.out.println(a.head.value);
        a.insertInLinkedList(62,2);
        a.insertInLinkedList(4,3);

        a.insertInLinkedList(6,4);
        a.insertInLinkedList(7,5);


      a.traversal();

      //  a.searchNode(5);
       // a.deletion(3);
       // a.ReverseDelete(2);

       // a.traversal();
    }
}
