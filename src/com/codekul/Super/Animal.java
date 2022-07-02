package com.codekul.Super;

public class Animal{
    void eat(){
        System.out.println("eating....");
    }

}

class Dog extends Animal{
    void run(){
        super.eat(); // we have called the parent class function using the super variable.
        System.out.println("running...");
    }
}

class AnimalImpl{
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.run();
    }
}

