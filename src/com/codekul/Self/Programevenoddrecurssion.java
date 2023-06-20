package com.codekul.Self;

public class Programevenoddrecurssion {
    public void number(int i,int n){
        if(i>=n){
            System.out.println(" ");
            return;

        }
        System.out.print(i+" ");
        number(i+2,n);

    }

    public static void main(String[] args) {
        Programevenoddrecurssion A=new Programevenoddrecurssion();
        A.number(2,10);
        A.number(1,10);
    }

}
