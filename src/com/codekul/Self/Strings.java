package com.codekul.Self;
import java.util.Arrays;

public class Strings {
    public void sort(String[] s1) {
        Arrays.sort(s1);
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
    }


    public static void main(String[] args) {
        Strings s=new Strings();

        String s1[] ={"geeksforgeeks", "geeks", "geek", "geezer"} ;
       // System.out.println(s1);
        s.sort(s1);


        }
    }
