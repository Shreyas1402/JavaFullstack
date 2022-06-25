package com.codekul.thiskeyword;

/**
 *  used to invoke current class method by using this keyword.
 */

public class A {

    int n;

    void m(A a){
        this.p();
        System.out.println("call current class method");
    }
    void n(){
        System.out.println("n method gets called ");
        m(this);
        System.out.println("exit from n");

    }
    void p(){
        System.out.println("qwertyuio");
    }
    public static void main(String[] args){
        A a =new A();
        a.n();
    }

}
