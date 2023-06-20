package com.codekul.Linked_list_problems;

public class main {
    public static void main(String[] args) {
        Linked_list A=new Linked_list();
        A.create(1);
        A.Insert(12);
        A.Insert(3);
        A.Insert(5);
        A.Insert(17);
       // A.partition(4);
        A.Traversal();
        A.delete(2);
        System.out.println(" ");
        A.Traversal();
       // A.Insert(7);

       // A.deletedups();



    }

}
