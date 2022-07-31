package com.codekul.Double_linked_list;

public class Main {
    public static void main(String[] args) {
        Double_list D=new Double_list();
        D.Create(7);
        System.out.println(D.head.value);
        D.Insertion(5,0);
        D.Insertion(4,3);
        D.Insertion(3,1);

        System.out.println(D.head.next.value);
        D.Traversal();
       // D.Reverse();
        D.Search(4);
        D.Delete(0);
        D.Traversal();
    }
}
