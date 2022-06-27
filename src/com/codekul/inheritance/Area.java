package com.codekul.inheritance;

import java.util.Scanner;

/**
 * (PRINT THE AREA OF ALL THE SHAPES USING INHERITANCE)
 * RECTANGLE
 * CIRCLE
 * SQUARE
 * TRIANGLE
 */

public class Area {

}

class rectangle extends Area {
    int l;
    int b;

    public rectangle(int l, int b) {

        int Area = l * b;
        System.out.println("THE AREA OF RECTANGLE IS: " + Area);
    }
}

class square extends Area {
    int l;

    public square(int l) {
        this.l = l;
        System.out.println("AREA OF SQUARE IS: " + l * l);
    }
}

class circle extends Area {
    int r;

    public circle(int r) {
        System.out.println("AREA OF CIRCLE IS: " + 3.14 * r * r);
    }
}

class triangle extends Area {
    int b;
    int h;

    public triangle(int b, int h) {
        this.b = b;
        System.out.println("AREA OF TRIANGLE IS:" + (b * h) / 2);
    }

}


class AreaImpl {
    public static void main(String[] args) {
        char ans;


        do{
            Scanner sc = new Scanner(System.in);
        System.out.println("ENTER 1 FOR AREA OF RECTANGLE \n ENTER 2 FOR AREA OF SQUARE \n ENTER 3 FOR AREA OF Circle \n ENTER 4 FOR AREA OF Triangle ");
        int a = sc.nextInt();


            switch (a) {

                case 1:

                    System.out.println("ENTER THE LENGTH");
                    int l1 = sc.nextInt();

                    System.out.println("ENTER THE BREADTH");
                    int b1 = sc.nextInt();
                    rectangle r2 = new rectangle(l1, b1);

                    break;


                case 2:
                    System.out.println("ENTER THE LENGTH:");
                    int l2 = sc.nextInt();
                    square s1 = new square(l2);
                    break;

                case 3:
                    System.out.println("ENTER THE RADIUS:");
                    int r1 = sc.nextInt();
                    circle c1 = new circle(r1);
                    break;

                case 4:
                    System.out.println("ENTER THE BASE: ");
                    int b2 = sc.nextInt();
                    System.out.println("ENTER THE HEIGHT: ");
                    int h1 = sc.nextInt();
                    triangle t1 = new triangle(b2, h1);
                    break;

                default:

                    System.out.println("INVALID INPUT");



            }
            System.out.println("DO YOU WANT TO CONTINUE?");
            ans=sc.next().charAt(0);

        }while (ans=='y'||ans=='Y');


    }
}
