package controlflowstatements;

import java.util.Scanner;

public class StarPattern3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j--)
            {
                System.out.print(" ");
            }
             for(int j=0;j<n;j++)
             {
                 System.out.print(" * ");
             }
            System.out.println("");
        }

    }
}
