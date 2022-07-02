package com.codekul.association;

public class Vehicle {
    int wheels;
    String vehicleTypes;
    String brand;




}
class car extends Vehicle{
    String segment;
    String model;
    String variant;
    String vehicle;
    Engine engine;
    MPlayer mPlayer;

    public car(String segment, String model, String variant, String vehicle, Engine engine, MPlayer mPlayer) {
        this.segment = segment;
        this.model = model;
        this.variant = variant;
        this.vehicle = vehicle;
        this.engine = engine;
        this.mPlayer = mPlayer;
    }

    void display()
    {
        System.out.println(segment);
        System.out.println(model);
        System.out.println(engine.cc);
        System.out.println(mPlayer.price);
        System.out.println(variant);

    }
}

class Engine{
    int stroke;
    String engineType;
    int cc;

}
class MPlayer{
    String companyName;
    double price;
    void display1(){
        System.out.println("qwertyu");
    }
}


class CarImpl{
    public static void main(String[] args) {


        Engine Suzukiengine= new Engine();
        Suzukiengine.cc=1296;
        Suzukiengine.engineType="diesel";
        Suzukiengine.stroke=4;
        MPlayer Sony=new MPlayer();
        Sony.companyName="SONY";
        Sony.price=123456;
        car car= new car("hashback","swift","BS6","car",Suzukiengine,Sony);



      car.display();
        Sony.display1();




    }
}
