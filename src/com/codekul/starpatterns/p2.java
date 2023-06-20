package com.codekul.starpatterns;

public class p2 {
    public static void main(String[] args) {
        for(int i=1;i<7;i++){
            for(int j=1;j<7;j++)
            {
                if(i%j==0){
                    System.out.print(j+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
