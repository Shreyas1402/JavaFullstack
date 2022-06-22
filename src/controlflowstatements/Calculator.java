package controlflowstatements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {

         char ch;
         int choice;
         int result;
         do{


             int no1,no2;
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter no1");
             no1=sc.nextInt();
             System.out.println("Enter no2");
             no2=sc.nextInt();
             System.out.println("Enter 1 for addition");
             System.out.println("Enter 2 for subtraction");
             System.out.println("Enter 3 for multiplication");
             System.out.println("Enter 4 for division");
             System.out.println("Enter 5 for modulo");
             System.out.println("PLEASE ENTER A CHOICE FROM THE ABOVE ");
             choice= sc.nextInt();

             switch(choice){
                 case 1:
                     result=no1+no2;
                     System.out.println("ADDITION IS:"+result);
                     break;

                 case 2:
                     result=no1-no2;
                     System.out.println("Subtraction is:"+result);
                     break;
                 case 3:
                     result=no1*no2;
                     System.out.println("Multiplication is:"+result);
                     break;

                 case 4:
                     result=no1/no2;
                     System.out.println("Division is:"+result);
                     break;

                 case 5:
                     result=no1%no2;
                     System.out.println("modulo is:" +result);
                     break;
                 default:
                     System.out.println("Invalid input");

             }
             System.out.println("DO YOU WANT TO CONTINUE?");
             ch=sc.next().charAt(0);

         } while(ch =='Y'||ch=='y');
    }
}
