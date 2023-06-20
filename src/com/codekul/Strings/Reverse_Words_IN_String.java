package com.codekul.Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_Words_IN_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        String c="";
        ArrayList<String> A=new ArrayList<>();
        for(int i=0;i<S.length();i++) {
            c=c+S.charAt(i);
            if (S.charAt(i) == '.' && A.isEmpty()) {
                c.replace(S.charAt(i),' ' );
            }


                if (S.charAt(i) == '.') {
                    A.add(c);
                    c = "";
                if (i == S.length() - 1) {
                    c = c + '.';
                    A.add(c);
                }
            }
        }
        System.out.println(A);
         String d="";
        for(int i=A.size()-1;i>=0;i--){
            d=d+A.get(i);
        }
        System.out.println( d);
    }
}
