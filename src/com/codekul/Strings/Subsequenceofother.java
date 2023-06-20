package com.codekul.Strings;

import com.codekul.Generics.PairUse;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequenceofother {
    static ArrayList<String> A=new ArrayList<>();
    public static void Substring(String s1,int i,String curr){
        if(i==s1.length()){
            A.add(curr);

            return;
        }
        Substring(s1,i+1,curr);
        Substring(s1,i+1,curr+s1.charAt(i));


    }
    public static boolean check(String s2){

        if(A.contains(s2)){
            return true;
        }
        return false;
    }

    public static boolean IdealApproach(String s1,String s2){
        int i=0;
        int j=0;
        while(i<s1.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            else{
                i++;
            }
        }
        if(j==s2.length()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String s2=s.next();
        String curr="";
        Substring(s1,0,curr);
        System.out.println(check(s2));
        System.out.println( IdealApproach(s1,s2));

    }
}
