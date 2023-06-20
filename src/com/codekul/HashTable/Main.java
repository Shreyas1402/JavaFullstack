package com.codekul.HashTable;

public class Main {
    public static void main(String[] args) {
        DirectChaining D=new DirectChaining(15);
        D.Insert("hello");
        D.Insert("Shreyas");
        D.Insert("Sh");
        D.Insert("qwerdwgdlc");
        D.Insert("qvdnabda");
        D.traversal();
      boolean b=  D.search("Shreyas");
        System.out.println(b);
        D.delete("Shr");
    }
}
