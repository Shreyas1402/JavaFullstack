package com.codekul.Recursion;

public class Palindrome {
    public static boolean palindrome_Check(String S,int i,int j){
        if(i>j){
            return true;
        }
        if(S.charAt(i)!=S.charAt(j)){
            return false;
        }

        return palindrome_Check(S,i+1,j-1);
    }
    public static void main(String[] args) {
        String S="q";
        System.out.println(palindrome_Check(S,0,S.length()-1));
    }
}
