package com.codekul.Strings;

public class Digit_in_string {
    public static void main(String[] args) {


        String s = "987654321";
        int i=0;
        while(i<s.length())
        {
            if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
                i++;
            }
            else{
                System.out.println("ERROR");
                System.exit(0);
            }
        }
        System.out.println("NO ERROR");
    }
}
