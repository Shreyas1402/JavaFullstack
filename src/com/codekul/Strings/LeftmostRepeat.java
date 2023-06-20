package com.codekul.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class LeftmostRepeat {
    public static void basicapproach(String s1,int a[]){
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

        System.out.println();

        int max=0;

        for(int i=0;i<a.length;i++){

            if(a[i]>a[max]){
                max=i;
            }

        }
        int ans=max+'a';
        char c=(char) ans;
        System.out.print(c+" ");


    }

    public static void expected_approach(int a[],String s1){
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s1.length(); i++) {
            int f = a[s1.charAt(i) - 'a'];
            if (a[s1.charAt(i) - 'a'] == -1) {
                a[s1.charAt(i) - 'a'] = i;
            } else {
                res = Math.min(res, f);
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();
        int a[] = new int[26];
        Arrays.fill(a, -1);

    }
}

