package com.codekul.starpatterns;

public class p3 {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(int k=5;k>i;k--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }

        for(int i=0;i<5;i++){

            for(int j=i;j<5;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            for(int k=0;k<=i+1;k++){
                System.out.print(" ");
            }
        }



    }
}
