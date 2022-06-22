package controlflowstatements;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        String c="";
        System.out.println("Enter a number who you want to check");
        Scanner sc=new Scanner(System.in);
                int a = sc.nextInt();
                boolean flag=false;

        for(int i=2;i<a/2;i++)
        {
            if(a%i==0)
            {
                flag=false;
                break;

            }
            else
            {
                flag=true;

            }
        }
        /*if(flag)
        {
            System.out.println("THE ENTERED NUMBER "+a+" IS PRIME");
        }
        else
        {
            System.out.println("THE ENTERED NUMBER "+a+" IS NOT PRIME");
        }

         */
        c=flag==true?"The entered number is prime":"The entered number is not prime";
        System.out.println(c);

    }
}
