package com.codekul.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LongestCommonPrefixinanArray {
    static String longestCommonPrefix(String arr[], int n) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String s = arr[i];
            String curr = "";
            for (int j = 0; j < s.length(); j++) {
                curr = curr + s.charAt(j);

                if (map.containsKey(curr)) {
                    int val = map.get(curr);
                    map.put(curr, val + 1);
                } else {
                    map.put(curr, 1);
                }
            }
        }
        System.out.println(map);
          int max=0;
          int sl=0;
        String res="";
        for(Map.Entry<String,Integer>it: map.entrySet()){
            int val= it.getValue();
            if(max<=val){
                max=val;
               // sl=it.getKey().length();
                res=it.getKey();
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String arr[]={"geeksforgeeks", "geeks", "geek",
                "geezer"};

        String a[]={"apple","ape","april"};

        String b=longestCommonPrefix(arr, arr.length);
        System.out.println(b);
    }
    }

