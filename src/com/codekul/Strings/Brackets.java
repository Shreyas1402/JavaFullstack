package com.codekul.Strings;

import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        String x="{[()]}";
        char ch[]=x.toCharArray();
        Stack<Character> S=new Stack<>();
        for(int i=0;i<x.length();i++){
            if(ch[i]=='('||ch[i]=='{'||ch[i]=='['){
                S.add(ch[i]);
            }
            else{
                char a=S.pop();
                System.out.println(a);
                if(a!=ch[i]){
                    System.exit(0);
                }
            }
        }
        System.out.println("IT IS VALID");
        for(int i=0;i<x.length();i++){
            System.out.println(ch[i]);
        }
    }
}
