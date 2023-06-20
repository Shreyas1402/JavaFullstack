package com.codekul.Self;

abstract public class Revision {
    void hey(){
        System.out.println("lol");
    }
    abstract void hello();
}
class A extends Revision{
     public A(){
         System.out.println("hell");
     }
    void hello(){
        System.out.println("hello");
    }

}
class B extends A{
    void hello(){
        System.out.println("hi");
    }
}


class mainIMPL{
    public static void main(String[] args) {
       A a=new A();

       Revision R =new A();
       R.hello();
       R.hey();
       a.hello();
       //b.hello();



    }
}
