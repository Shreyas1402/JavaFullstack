package com.codekul.Dynamic_programming;

public class FOR_LOOP {

    public static void Understanding(int day,int last){
        if(day<0){
            return;
        }
        for(int i=0;i<3;i++){
            if(i!=last){
            System.out.println(day+" "+i);
            Understanding(day-1,i);
            }


        }
       // System.out.println("*********************");
    }

    public static void main(String[] args) {
        Understanding(2,3);
    }
}
