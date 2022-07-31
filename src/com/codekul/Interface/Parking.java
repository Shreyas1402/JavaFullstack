package com.codekul.Interface;
// marker interface

public interface Parking {
}

class TwoWheeler implements Parking{
    void show(){
        System.out.println("IN TWO WHEELER");

    }
}
class FourWheeler{
    void show(){
        System.out.println("IN FOUR WHEELER");
    }

}

class ParkingIMPL{
    public static void main(String[] args) {
        TwoWheeler t1=new TwoWheeler();
        t1.show();
        if(t1 instanceof Parking){
            System.out.println("ALLOW");
        }
        else{
            System.out.println("DONT ALLOW");
        }

    }
}
