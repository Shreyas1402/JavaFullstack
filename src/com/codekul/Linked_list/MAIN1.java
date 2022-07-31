package com.codekul.Linked_list;

public class MAIN1 {
    public static void main(String[] args) {
        List a =new List();
        a.list(5);
        System.out.println(a.head.value);
        a.delete();
        System.out.println();
        a.Insert(4,1);
        System.out.println(a.head.value);
    }
}
