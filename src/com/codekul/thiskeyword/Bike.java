package com.codekul.thiskeyword;

public class Bike {
     int bikeNo;
     String bikeName;

    public Bike() {
        this(11,"ACTIVA");
    }

    public Bike(int bikeNo, String bikeName) {
        this.bikeNo = bikeNo;
        this.bikeName = bikeName;
    }
    void display() {
        System.out.println("bike details");
        System.out.println("NAME: "+bikeName);
        System.out.println("number"+bikeNo);

    }

}
class BikeImpl{
    public  static void main(String[] args){
        Bike b1= new Bike();
        b1.display();

    }
}

