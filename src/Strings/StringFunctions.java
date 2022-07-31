package Strings;

import java.util.Locale;
import java.util.Scanner;

public class StringFunctions {

    public static void main(String[] args) {
        String name="Shreyaspappu";
        int i=0;
        int vowel=0;
        int constant=0;
        int special=0;

       while(i<name.length()){
           if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){

               vowel++;

           }

           else{
               constant++;
           }


        }








    }
}
