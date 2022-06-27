package Strings;

import java.util.Locale;
import java.util.Scanner;

public class StringFunctions {

    public static void main(String[] args) {
        String name="Shreyas";

        int length=name.length();
        System.out.println(length);

        String us=name.toUpperCase();
        System.out.println(us);

        String ls=us.toLowerCase();
        System.out.println(ls);

        String sub=name.substring(0,4);
        System.out.println(sub);

        System.out.println(name.replace('s','p'));

        System.out.println(name.startsWith("Sh")); // will return true if it matches

        System.out.println(name.indexOf('s',4));

        System.out.println(us.equals("SHREYAS"));


        Scanner a=new Scanner(System.in);
        String A=a.next();
        String B=a.next();







    }
}
