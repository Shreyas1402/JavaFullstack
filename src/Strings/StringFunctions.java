package Strings;

import java.util.Locale;
import java.util.Scanner;

public class StringFunctions {

    public static void main(String[] args) {
        String name="shreyaspappu";
        char y[]=name.toCharArray();
        int i=0;
        int vowel=0;
        int constant=0;
        int special=0;

       while(i<name.length()){
           if(y[i]>='a'&& y[i]<='z') {
               if (y[i] == 'a' || y[i] == 'e' || y[i] == 'i' || y[i] == 'o' || y[i] == 'u') {
                   vowel++;
               } else {
                   constant++;
               }
           }
           else{
               special++;

               }
              i++;
               }
        System.out.println("The number of vowels are "+vowel);
        System.out.println("The number of constants are "+constant);
        System.out.println("The number of specials are "+special);

           }








    }

