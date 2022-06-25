package controlflowstatements;

import java.util.Scanner;

 public class ReveerseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int no = sc.nextInt();
        int rem;
        int rev = 0;
        while (no > 0) {
            rem = no % 10;
            no = no / 10;

            rev = rev * 10 + rem;
        }
        System.out.println(rev);


    }
}
