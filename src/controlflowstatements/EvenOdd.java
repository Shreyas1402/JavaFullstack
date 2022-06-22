package controlflowstatements;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK WHETHER A NUMBER IS EVEN OR ODD ");
        int a= sc.nextInt();
        if(a%2==0)
        {
            System.out.println("THE NUMBER YOU HAVE ENTERED " + a + " IS EVEN");
        }
        else
        {
            System.out.println("THE NUMBER YOU HAVE ENTERED " + a + " IS ODD");
        }


    }
}
