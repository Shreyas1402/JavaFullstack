package controlflowstatements;

import java.util.Scanner;

public class AmstrongNumbers {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int no1=no;
        while(no>0){
            int rem=no%10;
             sum+=rem*rem*rem;

            no=no/10;

        }
        System.out.println(sum);

        if(sum==no1){
            System.out.println("THE NUMBER YOU HAVE ENTERED IS AN AMSTRONG NUMBER:");
        }


    }
}
