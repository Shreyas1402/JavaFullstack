package controlflowstatements;

public class Homework {
    public static void main(String[] args) {
        int a = 30;
        int b = 45;
        int c = 10;
         // if(a>b){
        // }

        if (a > b && a > c) {
            System.out.println("INTEGER A" + a + " HAS THE GREATEST VALUE");
        } else if (b > a && b > c) {
            System.out.println("INTEGER B  HAS THE GREATEST VALUE");
        } else {
            System.out.println("INTEGER C" + c + " HAS THE GREATEST VALUE");
        }

        // TO FIND THE SMALLEST INTEGER

        if (a<b && a<c)
        {
            System.out.println("INTEGER A IS THE SMALLEST");
        }
        else if (b<a&&b<c)
        {
            System.out.println("INTEGER B IS THE SMALLEST");
        }
        else
        {
            System.out.println("INTEGER C HAS THE SMALLEST");
        }


    }
}
