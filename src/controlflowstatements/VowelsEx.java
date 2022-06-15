package controlflowstatements;

import java.util.Scanner;

public class VowelsEx {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your character here:");
        char ch=sc.next().charAt(0);
        String ch1=sc.next();
        switch(ch){

            case'a':
                System.out.println("THE ENTRY WHICH YOU HAVE MADE IS A VOWEL");
                break;



            case'e':
                System.out.println("THE ENTRY WHICH YOU HAVE MADE IS A VOWEL");
                break;



            case'i':
                System.out.println("THE ENTRY WHICH YOU HAVE MADE IS A VOWEL");
                break;

            case'o':

                System.out.println("THE ENTRY WHICH YOU HAVE MADE IS A VOWEL");

                break;

            case'u':
                System.out.println("THE ENTRY WHICH YOU HAVE MADE IS A VOWEL");

            default:
                System.out.println("THE ENTRY WHICH YOU HAVE MADE IS NOT A CONSTANT");




        }

    }
}
