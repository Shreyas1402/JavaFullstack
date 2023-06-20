package com.codekul.Strings;

import java.util.Scanner;

public class PatternSearcingProblem {
    public static void Search(String S1,String S2){
        int i=0;
        int j=0;
        while(i<S1.length()){
            if(S1.charAt(i)!=S2.charAt(j)){
                i++;
                j=0;
            }
            else if(S1.charAt(i)==S2.charAt(j)){
                 i++;
                 j++;
            }
            else if(j==S2.length()){
                int res=i-j;
                System.out.println(res);
                j=0;
            }
            else{
                System.out.println("not present");
            }

        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER THE STRING ONE");
        String S1   =s.nextLine();

        String S2=s.nextLine();
        Search(S1,S2);

    }
}
