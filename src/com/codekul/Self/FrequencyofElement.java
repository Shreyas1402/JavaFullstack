package com.codekul.Self;

import java.util.Scanner;

public class FrequencyofElement {
    public static void main(String[] args) {
        int element[]=new int [26];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();

        System.out.println(s);
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)==' '){
              continue;
          }

            int j=s.charAt(i)-'a';

            element[j]++;
        }

        for(int i=0;i<25;i++){
            System.out.print(element[i]+" ");
        }
    }
}
