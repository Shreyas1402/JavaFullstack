package com.codekul.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class Remove_duplicates {
    public static void main(String[] args) {
        ArrayList<Integer>arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        Hash h=new Hash();
        h.Remove(arr);
    }
}

class Hash{
    public void Remove(ArrayList<Integer>arr){
        HashMap<Integer,Boolean>A=new HashMap<>();
        for(int i=0;i<arr.size();i++){

        }

    }
}
