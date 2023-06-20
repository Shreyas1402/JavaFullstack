package com.codekul.Self;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args)

    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count=0;
        String a="";
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(c[i]>=32&&c[i]<=64){
                count++;
            }

        }
        System.out.println(count);
        for(int i=0;i<s.length()+1;i++) {
            if (s.charAt(i) >= 32 && s.charAt(i) <= 64) {
                if (a == "") {
                    continue;
                }
                System.out.println(a);
                a = "";
            } else {
                a = a + s.charAt(i);
            }
        }
        scan.close();
    }
}



