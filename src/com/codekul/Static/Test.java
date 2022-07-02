package com.codekul.Static;

public class Test {
    int counter=0;
   static int Scounter=0;
     Test(){
         counter++;
         System.out.println("NON STATIC:"+counter);
         Scounter++;
         System.out.println("STATIC:"+Scounter);
     }

    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        Test t3=new Test();


    }

}
