package controlflowstatements;

import java.util.Scanner;

public class TableEx {
    public static void main(String[] args)
    {
      //  int no = Integer.parseInt(args[0]);
        Scanner sc=new Scanner((System.in));
        System.out.println("ENTER THE NUMBER WHOSE TABLE YOU WANT TO PRINT: " );
        int no= sc.nextInt();
        for (int i=1;i<11;i++)
        {
            for (int j=1;j<i;j++) {
                System.out.println(no * i* j);
            }
        }
    }
}
