package com.codekul.Strings;

import java.util.Arrays;

public class Anagrams1 {
    public static boolean checkAnagram(String s1,String s2){
        int count[]=new int[26];

        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
         return true;
    }

    public static void main(String[] args) {
        String s1="listek";
        String s2="silent";
        System.out.println( checkAnagram(s1,s2));
        int a[]=new int[26];
        Arrays.fill(a,-1);

        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
}
