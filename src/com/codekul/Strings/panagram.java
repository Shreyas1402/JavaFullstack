package com.codekul.Strings;

import java.util.Arrays;

public class panagram {
    public static void main(String[] args) {
        String s1="SILENTB";
        String s2="LISTENA";

        char ch[]=s1.toCharArray();
        char ch1[]=s2.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(ch1);
        //System.out.println(ch[0]);

        for(int i=0;i<s1.length();i++){
            if(ch[i]!=ch1[i]){
                System.out.println("it is not a panagram");
                System.exit(10);

            }
        }
        System.out.println("it is a panagram");

    }
}
