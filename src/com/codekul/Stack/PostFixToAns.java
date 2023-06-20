package com.codekul.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PostFixToAns {
    public static int convert(String s){
        Stack<String>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                st.add(String.valueOf(s.charAt(i)));

              //  System.out.println(st);
            }

            else{
                int res=0;
                String value1=st.pop();
                String value2=st.pop();
                int val1=Integer.parseInt(value1);
                int val2=Integer.parseInt(value2);
                switch (s.charAt(i)){
                    case '+':{
                        res=val1+val2;
                        break;
                    }
                    case'-':{
                       res=val1-val2;
                       break;
                    }
                    case'*':{
                        res=val1*val2;
                        break;
                    }
                    case'/':{
                        res=val1/val2;
                        break;
                    }
                    case'^':{
                        res=val1^val2;
                        break;
                    }
                }
                st.add(String.valueOf(res));
            }

        }
        System.out.println(st.peek());
        return Integer.parseInt(st.peek());
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        String S=s.nextLine();
        System.out.println( convert(S));

    }
}
