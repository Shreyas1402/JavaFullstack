package com.codekul.Super;

/**
 * used to invoke parent class constructor
 */

public class vehicle {
    int vehicleCode;
    String VehicleType;



    public vehicle(int vehicleCode, String vehicleType) {
        this.vehicleCode = vehicleCode;
        VehicleType = vehicleType;
    }
}
class Bike extends vehicle{
    String bikeName;
    String  brand;
    String model;



    public Bike(int vehicleCode, String vehicleType, String bikeName, String brand, String model) {

        super(vehicleCode, vehicleType);
        // this and super cannot be used in the same constructor
        this.bikeName = bikeName;
        this.brand = brand;
        this.model = model;

    }
    void display(){
        System.out.println("Vehicle Code:"+super.vehicleCode);
        System.out.println("Vehicle Type:"+super.VehicleType);
        System.out.println("Bike Name:"+this.bikeName);
        System.out.println("brand:"+this.brand);
        System.out.println("model:"+this.model);

    }
}
class vehicleImpl{
    public static void main(String[] args) {
        Bike b1=new Bike(101,"bike","Splender","Hero","125cc");
        b1.display();
    }
}
