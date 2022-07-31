package com.codekul.Circular_linked_list;

public class main {
    public static void main(String[] args) {
        circular_linked_list A=new circular_linked_list();
        A.create(5);
        //System.out.println(A.Head.value);
        A.Insertion(2,0);
        A.Insertion(3,2);
        A.Insertion(4,3);
        System.out.println(A.Head.value);
        System.out.println(A.Head.next.value);
        System.out.println(A.Head.next.next.value);

        A.Search(11);
        A.Delete(2);
        A.Traversal();


    }
}
