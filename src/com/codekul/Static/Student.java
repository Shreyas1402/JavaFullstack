package com.codekul.Static;

import java.util.Scanner;

public class Student {
    int rno;
    String name;

    public Student() {
        this.rno = rno;
        this.name = name;

    }

    static String schoolname= "JJ HIGH SCHOOL";
    void display(){
        System.out.println("ROLL NO: "+rno);
        System.out.println("NAME:"+name);
        System.out.println("SCHOOL NAME:"+schoolname);
    }

}
 class StudentImpl{
     public static void main(String[] args) {
        Student s1=new Student();
        s1.rno=1;
        s1.name="AMIT";
        Student.schoolname="JJ";
        //STATIC VARIABLE CAN BE CALLED BY THE CLASS NAME AS WELL.

         Student s2=new Student();
         s2.rno=1;
         s2.name="AMIT";
         Student.schoolname="JJ";

         s1.display();
         s2.display();


     }
 }
