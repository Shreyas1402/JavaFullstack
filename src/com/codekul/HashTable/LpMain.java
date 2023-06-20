package com.codekul.HashTable;

public class LpMain {
    public static void main(String[] args) {


        Linear_probing L = new Linear_probing(15);
        L.Insert("hello");
        L.Insert("SHREYAS");
        L.Insert("SHS");
        L.Insert("SHR");
        L.Insert("AHSAKDLJ");
        L.Insert("SHREYAS");
        L.Insert("hello");
        L.Insert("SHREYAS");
        L.Insert("SHS");
        L.Insert("SHR");
        L.Insert("AHSAKDLJ");
        L.Insert("SHREYAS");
        L.Insert("hello");
        L.Insert("SHREYAS");
        L.Insert("SHS");
        L.Insert("SHR");
        L.Insert("AHSAKDLJ");
        L.Insert("SHREYAS");

        L.Search("SHREYAS");
        L.Delete("SHREYAS");




    }

}
