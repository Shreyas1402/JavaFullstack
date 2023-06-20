package com.codekul.Recursion;

import java.util.HashSet;

public class remove_char {
      static String n="";
    public static String remove(String S,int i,char x)
    {

        if (i==S.length()){
            return n;
        }

        if(S.charAt(i)!=x){
            n=n+S.charAt(i);
        }

        return remove(S,i+1,x);
    }

    public static void main(String[] args) {
        String s = "abxcxxz";
        int i = 0;
        char m = 'x';
        System.out.println(remove(s, i, m));
        HashSet<Character> H = new HashSet<>();
        String h = s.replace('x', 'y');
        System.out.println(h);
        System.out.println(" new ");

        tp(h);
    }
   static String arr[]={};
    public static String tp(String h){
        if(h==null){
            return null;
        }
        System.out.println(h);
      // arr = tp(h.substring(1));
return h;
    }

}
