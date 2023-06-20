package com.codekul.Strings;

import java.util.HashMap;

public class repeating_characters {
    public static void main(String[] args) {
        String s="";
        int n=s.length();
        //s.toCharArray();
        HashMap<Character,Integer> Map=new HashMap<>();
        for(int i=0;i<n;i++){
            char key=s.charAt(i);
            if(Map.containsKey(key)){
                int val= Map.get(key);
                Map.put(key,val+1);
            }
            else{
                Map.put(key,1);
            }
        }
        System.out.println(Map);
    }
}
