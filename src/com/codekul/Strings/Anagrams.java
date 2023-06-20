package com.codekul.Strings;
import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String a="anagram";
        String b="margana";
        char ch[]=a.toCharArray();
        char ch1[]=b.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<a.length();i++){
            System.out.print(ch[i]+" ");
        }
        for(int i=0;i<a.length();i++){
            if(ch[i]!=ch1[i]){
                System.out.println("Not Anagram");
                System.exit(0);
            }

        }
        System.out.println("Anagrams");
    }
}
