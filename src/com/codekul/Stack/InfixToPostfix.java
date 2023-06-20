package com.codekul.Stack;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {
    static Stack<Character>S=new Stack<>();
    static HashMap<Character,Integer> precedence=new HashMap<>();
    static String output="";
    public void AddPrerecedence(){

        precedence.put('+',1);
        precedence.put('-',1);
        precedence.put('*',2);
        precedence.put('/',2);
        precedence.put('^',3);

    }








    public static  void Convert(String a){
        for(int i=0;i<a.length();i++) {
            if (a.charAt(i) >= 97 && a.charAt(i) <= 122) {
                output += a.charAt(i);
            } else if (a.charAt(i) == '(') {
                S.add(a.charAt(i));
            } else if (!S.isEmpty() && a.charAt(i) == ')') {
                while (!S.isEmpty()) {

                    output += S.pop();
                }
                System.out.println(S);

            }
            else if (a.charAt(i) == '*' || a.charAt(i) == '/' || a.charAt(i) == '+' || a.charAt(i) == '-' || a.charAt(i) == '^') {
                    if (precedence.containsKey(a.charAt(i)) && precedence.containsKey(S.peek())) {
                        int b = precedence.get(a.charAt(i));
                        int c = precedence.get(S.peek());
                        if (b <= c) {
                            char d = S.pop();
                            output += d;
                            S.add(a.charAt(i));
                        }
                    }
                    else{

                            S.add(a.charAt(i));
                    }

                }
            }



        while(!S.isEmpty()){

            char b=S.pop();
            output+=b;
        }
        System.out.println(output);
    }

    public static void main(String[] args) {
        String s="a+b)";
        Convert(s);
        char c='1';
        char v='*';
        int a=(int) c;
        int b=3;
        int d=(int)v;




    }

}
