package com.codekul.Self;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] A=new int[7];
        A[0]=23;
        A[1]=21;
        A[2]=22;
        A[3]=21;
        A[4]=22;
        A[5]=21;
        A[6]=22;



        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<A.length-1;i++){
            if(n==A[i]){
                System.out.println("ELEMENT FOUND AT INDEX "+i);
            }
        }

    }

}


