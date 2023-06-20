package com.codekul.Stack_Questions;

import java.util.*;

public class tp {
    public static String printMinIndexChar(String S, String patt){

        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<S.length();i++){
            if(!map.containsKey(S.charAt(i))){

                map.put(S.charAt(i),i);
            }
        }
        System.out.println(map);
        int mini=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<patt.length();i++){
            if(map.containsKey(patt.charAt(i))){
                int val=map.get(patt.charAt(i));
                if(mini>val){
                    ans="";
                    mini=val;
                    ans+=patt.charAt(i);
                }
            }
        }


        return ans;
    }

    public static boolean searchPattern(String str, String pat) {

        ArrayList<String>A=new ArrayList<>();
        String ans="";
        for(int i=0;i<str.length();i++){
            ans+=str.charAt(i);
            A.add(ans);
        }
        System.out.println(A);
        if(A.contains(pat)){
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        String S="vxhpddqhoa";
        String s1="ofdqnlkrsc";

        String s2="abcd";
        String s3="bc";
        System.out.println(searchPattern(s2,s3));

        //printMinIndexChar(S,s1);
    }
}
