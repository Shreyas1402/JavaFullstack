package com.codekul.HashMap;

import java.util.HashMap;
import java.awt.event.*;
public class Anagram {
    public static void IsAnagram(String a, String b) {
        HashMap<Character, Integer> M1 = new HashMap<>();
        HashMap<Character, Integer> M2 = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);


            //System.out.println(val);
            if (M1.containsKey(c)) {
                int val = M1.get(c);
                M1.put(c, val + 1);
            } else {
                M1.put(c, 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);

            if (M2.containsKey(c)) {
                int val = M2.get(c);
                M2.put(c, val + 1);
            } else {
                M2.put(c, 1);
            }


        }
        if(M1.equals(M2)){
            System.out.println("qwery");
        }
        System.out.println(M1);
        System.out.println(M2);


    }
    public static int add(int a,int b){
        return a+b;
    }






    public static void main(String[] args) {
        String a = "CATq";
      String  b = "qTAC";
        IsAnagram(a, b);
        int j=07;
        System.out.println(j);
        //int n =gcd(n,d);

        // System.out.println(c);
    }
}

