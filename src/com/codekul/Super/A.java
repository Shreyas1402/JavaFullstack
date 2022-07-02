package com.codekul.Super;

public class A {
    int a=10;
}
 class B extends A{
    int a=20;
    void display(int a){
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
}

class AImpl{
    public static void main(String[] args) {
        B b=new B();
        b.display(30);
    }

}