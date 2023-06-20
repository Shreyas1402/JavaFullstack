package com.codekul.Recursion;

import java.util.ArrayList;
import java.util.*;

public class StirngSubsets {
    static ArrayList<String>B=new ArrayList<>();
    public static void String(String s,String A){
        if(s.length()==0){
            System.out.print(A+"   ");
            return;
        }
        String(s.substring(1),A+s.charAt(0));
        String(s.substring(1),A);




    }

    public static void main(String[] args) {
        String a="abc";
        a.contains("a");
        
        //System.out.println(a.charAt(2));
        //System.out.println(a.substring(0));

       String(a,"");

    }
}
