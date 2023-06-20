package oops;

class Greeter {
    String name;

     public int Greeter(String name){             // constructor that is def_init__ in python
         this.name=name;
         System.out.println(name);
         return 1;
     }
}

//abstract class
abstract class Car{
    abstract void accelerate();
    abstract void brake();
   // abstract void engine(int value);

     void body(){
         System.out.println();
     }
}
//concrete class
class kia extends Car{
    void accelerate(){
        System.out.println("Suzuki::accelerate");

    }
    void brake(){
        System.out.println("4 breaks");
    }

}

 class main {
     public static void main(String[] args) {
       Greeter g=new Greeter();
         System.out.println(g.name);
         /*Car obj =new kia();
         obj.body();*/

         kia seltos =new kia();
         seltos.body();
     }
 }