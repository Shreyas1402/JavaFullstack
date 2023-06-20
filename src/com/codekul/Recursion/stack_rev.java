package com.codekul.Recursion;

import java.util.Stack;

public class stack_rev {

    public static void rec(Stack<Integer>s,int x){
    if(s.isEmpty()){
        return;
    }

    rec(s,s.pop());
       s.add(x);
}

    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        rec(s,0);
        System.out.println(s);
        String S="qwertyui";
        char ch[];
    }
}
