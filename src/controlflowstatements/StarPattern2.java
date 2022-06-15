package controlflowstatements;

import java.util.Scanner;

public class StarPattern2  {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF STARS YOU WANT:");
        int a= sc.nextInt();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        System.out.println("THIS IS THE OPPOSITE OF THE FIRST:");

        for(int i =a;i>0;i--)
        {
            for(int j=i-1;j>0;j--)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }
}
