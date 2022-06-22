package controlflowstatements;

import java.util.Scanner;

public class StarPattern3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int n=sc.nextInt();

        for(int i=n;i>0;i--)
        {
            System.out.println(" * ");
            for(int j=1;j<i;j++)
            {
                System.out.print("  ");
            }
        }


        }

    }

