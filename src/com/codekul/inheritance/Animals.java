package com.codekul.inheritance;

public class Animals {
  void eat()
  {
      System.out.println("ANIMALS CAN EAT ANYTHING");
  }

}
class dog extends Animals{
    void run(){
        System.out.println("DOG CAN RUN ANYWHERE");
    }
}
class BabyDog extends dog {
    void sleep(){
        System.out.println("THEY ONLY SLEEP AT NIGHT");
    }
}
class AnimlasImpl{
    public static void main(String[] args){
        BabyDog dog =new BabyDog();
        dog D1=new dog();
        dog.sleep();
        dog.run();
        dog.eat();


    }
}

