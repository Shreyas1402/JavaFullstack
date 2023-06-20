package com.codekul.Strings;

import java.util.HashSet;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        String m= s.next();
        String n="";
        for(int i=0;i<m.length();i++){
            n=m.charAt(i)+n;
        }
        if(m.equals(n)){
            System.out.println("true");
            System.out.println(m);
            System.out.println(n);

        }

        HashSet<Character> A=new HashSet<>();

    }
}
