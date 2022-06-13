import java.util.Scanner;



public class Board_Percentage_calculator {
    public static void main(String[]args)
    {
        Scanner m = new Scanner(System.in);
        System.out.println("Enter your name");
        String name;
        name = m.next();
        System.out.println("ENTER YOUR MARKS IN MATHS");
        float maths = m.nextInt();
        System.out.println("ENTER YOUR MARKS IN PHYSICS");
        float physics = m.nextInt();
        System.out.println("ENTER YOUR MARKS IN CHEMISTRY");
        float chem = m.nextInt();
        System.out.println("ENTER YOUR MARKS IN BIOLOGY");
        float bio = m.nextInt();
        System.out.println("ENTER YOUR MARKS IN ENGLISH");
        float eng = m.nextInt();


        float sum = (maths+physics+chem+bio+eng);
        if(sum<500&&maths<101&&physics<101&&chem<101&&bio<101&&eng<101)
        {
            float percentage = (sum / 5) ;

            System.out.println("CONGRATULATIONS "+ name + " YOU HAVE SCORED "+percentage+" percent");
        }

        else
        {
            System.out.println("INVALID INPUT");
        }







    }





}
