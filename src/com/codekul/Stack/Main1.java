package com.codekul.Stack;

public class Main1 {
    public static void main(String[] args) {
        Stack_Linked A=new Stack_Linked();
        A.push(3);
        A.push(4);
        A.tra();
       int b= A.peek();
        System.out.println(b);
        int c= A.peek();
        System.out.println(c);
        int f=A.peek();
        System.out.println(f);
        A.delete();
    }

    }


