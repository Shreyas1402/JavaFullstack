package com.codekul.abstraction;

import jdk.swing.interop.SwingInterOpUtils;

interface fun{
    void print();
    void hello();
}
interface funk extends fun{
    void qwe();
    public final static int n=4;
}

public abstract class Person {
    int age;
    int rollno;

    //abstract int id();

    public Person(int age,int rollno){
        this.age=age;
        this.rollno=rollno;
        System.out.println(age+"   "+rollno);
    }

    public abstract boolean isStudying();



    }

    class Student extends Person implements funk{
    public Student(){

        super(10,34);
        System.out.println("je;plmdlamd");
    }

        @Override
        public boolean isStudying() {
            return false;
        }

        @Override
        public void hello() {
            System.out.println("hello");
        }

        @Override
        public void print() {
            System.out.println("print");
        }

        @Override
        public void qwe() {
            System.out.println("qwe");
        }
    }


 class dfs {
     public static void main(String[] args) {

         Person p = new Person(12, 11) {
             @Override
             public boolean isStudying() {
                 return true;
             }
         };
         Student s = new Student();

//     Student s2=new Student("v");

     }
 }


