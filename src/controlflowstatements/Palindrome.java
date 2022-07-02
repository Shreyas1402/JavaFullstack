package controlflowstatements;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER YOU WANT TO CHECK: ");
        int no= sc.nextInt();
        int no1=no;
        int rem,rev=0;
        // to reverse the number
        while (no>0){

            rem=no%10;
            no=no/10;
            rev=rev*10+rem;



        }
        System.out.println(rev);

        if(rev==no1){
            System.out.println("THE NUMBER YOU HAVE ENTERED IS A PALINDROME:"+"\n"+no1+"\n"+rev);

        }
        else{
            System.out.println("THE NUMBER YOU HAVE ENTERED IS  NOT A PALINDROME:"+"\n"+no1+"\n"+rev);
        }


    }


}
