package controlflowstatements;

import java.util.Scanner;

public  class Divisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int no =sc.nextInt();
        if(no%3==0&&no%5==0){
            System.out.println("THE NUMBER YOU HAVE ENTERED IS DIVISIBLE BY 3 AND 5.");
        } else if (no%3==0) {

            System.out.println("THE NUMBER YOU HAVE ENTERED IS DIVISIBLE BY 3");
        }
         else if(no%5==0){
            System.out.println("THE NUMBER YOU HAVE ENTERED IS DIVISIBLE BY 5");
        }
         else{
            System.out.println("THE NUMBER YOU HAVE ENTERED IS NOT DIVISIBLE BY 3 AND 5.");
        }

    }
}
