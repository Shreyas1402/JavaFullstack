package com.codekul.ArrayDeque;

import java.sql.SQLOutput;
import java.util.ArrayDeque;
import java.util.Iterator;

public class GetminGetmax {
   static ArrayDeque<Integer>A=new ArrayDeque<>();
   static int min=Integer.MAX_VALUE;
   static int max=Integer.MIN_VALUE;
   public static void  InsertMin(int x){
       if(x>min){
           throw new ArithmeticException("invalid input ");
       }
       min=x;
       A.addFirst(x);
   }
   public static void InsertMax(int x){
       if(x<max){
           throw new ArithmeticException("invalid input ");

       }
       max=x;

           A.addLast(x);


   }
   public static int getMax(){
       return A.getLast();
   }
   public static int getMin(){
       return A.getFirst();
   }

   public static void extractmin(){
       A.removeFirst();
   }
   public static void extractmax(){
       A.removeLast();
   }
   public static void print(ArrayDeque<Integer>A){
      // Iterator it= A.iterator();
       System.out.println(A);
   }

    public static void main(String[] args) {
        InsertMin(5);
        InsertMin(3);
        InsertMin(2);
        InsertMax(100);
        extractmin();
        InsertMin(8);
        print(A);
    }

   }


