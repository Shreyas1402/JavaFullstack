package com.codekul.Self;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class practice {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);


        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();

        if(x>y&&x<z||x<y&&x>z){
            System.out.println(x);
        }
        else if(y>x&&y<z||y>z&&y<x){
            System.out.println(y);
        }
        else{
            System.out.println(z);
        }

    }


}

