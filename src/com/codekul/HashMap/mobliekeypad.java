package com.codekul.HashMap;

import com.codekul.Generics.PairUse;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

class Node{
    int val;
    Node next;
        }

public class mobliekeypad {

    public static boolean check(char a, char input) {

        if (a == '{' && input == '}' || a == '(' && input == ')' || a == '[' && input == ']') {
            return true;
        } else
            return false;
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);


        String input = sc.next();
        Boolean flag = false;
        Stack<Character> S = new Stack<>();

        for (int i = 0; i < input.length(); i++) {


            if (input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[') {
                S.add(input.charAt(i));
            } else if (input.charAt(i) == '}' || input.charAt(i) == ')' || input.charAt(i) == ']') {
                if(S.isEmpty()){
                    flag=false;
                    break;
                }
                if (check(S.peek(), input.charAt(i))) {
                    flag = true;
                    S.pop();
                } else if (check(S.peek(), input.charAt(i)) == false) {
                    flag = false;
                    break;
                }
            }
        }
        //

        if (flag&&S.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }


    }
}



