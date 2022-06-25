package controlflowstatements;

import java.util.Scanner;

public class StarPattern6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int no= sc.nextInt();

        for(int i=0;i<no;i++){

            for(int k=0;k<no;k++){

                System.out.println(" ");
            }



            for( int j=0;j<2*i;j++){

                System.out.print(" * ");
            }

        }

    }
}
