package controlflowstatements;

import java.util.Scanner;

public class SwitchCaseHomework {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("First letter should be capital of the abbreviation");
        System.out.println("ENTER ABBREVIATION OF A MONTH ");
        String month=sc.next();
        switch(month)
        {
            case "Jan":
                System.out.println("JANUARY");
                break;

            case "Feb":
                System.out.println("FEBRUARY");
                break;

            case "Mar":
                System.out.println("MARCH");
                break;

            case "Apr":
                System.out.println("APRIL");
                break;

            case "May":
                System.out.println("MAY");
            break;

            case "Jun":
                System.out.println("JUNE");
                break;

            case "Jul":
                System.out.println("JULY");
                break;

            case "Aug":
                System.out.println("AUGUST");
                break;

            case "Sept":
                System.out.println("SEPTEMBER");
                break;

            case "Oct":
                System.out.println("OCTOBER");
                break;

            case "Nov":
                System.out.println("NOVEMBER");
              break;


            case "Dec":
                System.out.println("DECEMBER");
                break;

            default:
                System.out.println("WRONG INPUT");





        }


    }
}
