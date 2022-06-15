package controlflowstatements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER BETWEEN 1 AND 7");
        int a = sc.nextInt();
        switch (a)
        {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("");
                break;

            case 3:
                System.out.println("three");
                break;

            default:
                System.out.println("sorry");

        }

    }
}
