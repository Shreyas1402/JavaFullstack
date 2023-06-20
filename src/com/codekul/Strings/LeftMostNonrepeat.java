package com.codekul.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LeftMostNonrepeat {

    public static void Check(int a[],String s1){
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']++;
        }
        for(int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length;i++){
            if(a[i]==1)
            {
                int c=i+'a';
                char ans=(char)c;
                System.out.println(ans);
                break;
            }
        }
        }
public static char String(String S) {
    int a[] = new int[26];
    Arrays.fill(a, -1);
    for (int i = 0; i < S.length(); i++) {
        int f = (S.charAt(i) - 'a');
        if (a[f] == -1) {
            a[f] = i;
        } else {
            a[f] = -2;
        }
    }
    for (int i = 0; i < a.length; i++) {
        if (a[i] > 0) {
            return S.charAt(i);
        }
    }

    return '$';
}

    public static void main(String[] args) {
        int a[]=new  int [26];
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        Check(a,s1);

        System.out.println(String(s1));
    }

    }

