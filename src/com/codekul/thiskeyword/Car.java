package com.codekul.thiskeyword;

import java.util.Scanner;

public class Car {
    int carNO;
    String carName;
    double price;


    public Car(int carNO, String carName) {
        this.carNO = carNO;
        this.carName = carName;
    }

    Car(int carNo, String carName, double price) {
        this.carNO=carNo;
        this.carName=carName;
        this.price=price;

    }
    void display()
    {
        System.out.println("************ CAR DETAILS *************");
        System.out.println("VEHICLE NO: "+carNO);
        System.out.println("CAR NAME: "+carName);
        System.out.println("PRICE: "+price);
    }

}

 class CarImpl{
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER CAR NUMBER");
        int carNo=sc.nextInt();
        System.out.println("ENTER CAR NAME");
        String carName= sc.next();
        System.out.println("ENTER PRICE");
        double price= sc.nextDouble();

        Car c1= new Car(101,"Honda",123456789);
        c1.display();

        Car c2 =new Car(carNo,carName,price);
        c2.display();




    }


}

