package com.codekul.Polymorphism;

public class Addition {
    int add(int no1,int no2) {
        return no1+no2;
    }
    int add(int no1, int no2, int no3){
        return no1+no2+no3;

    }
    float add(float f1,float f2){
        return f1+f2;
    }
    void add(int ...n){
        System.out.println(" calling Var args");
    }

}
class AdditionImpl{
    public static void main(String[] args){
        Addition add1=new Addition();
        System.out.println(add1.add(3,4));
        System.out.println(add1.add(3,4,5));
        System.out.println(add1.add(3f,5f));
        add1.add();
    }
}
