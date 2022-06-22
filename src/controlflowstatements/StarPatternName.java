package controlflowstatements;

/*
      ways to print s:
      ********
      *
      *
      ********
             *
             *
       *******
 */

public class StarPatternName {

    public static void main(String[] args) {
        int no = 5, num = 4;
        int j=0;
        for (int i = 0; i < no; i++) {
            System.out.print(" * ");
        }
        for (int i = 0; i < num; i++) {
            System.out.println(" * ");
        }
        for (int i = 0; i < no; i++) {
            System.out.print(" * ");
        }

            do {
            for (int i = 0; i < 5; i++) {
                System.out.print("   ");
            }
            System.out.println(" * ");
            j++;
        }while(j<6);

        for (int i = 0; i < no; i++) {
            System.out.print(" * ");
        }
        }

    }


