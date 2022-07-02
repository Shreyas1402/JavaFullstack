package com.codekul.Polymorphism;

public class Area {
    float Area() {
     return 0;
    }
}
class Square extends Area{
    float Area(){
        return 2*2;
    }
}
class rectangle extends Area{
    float Area(){
        return 3*6;
    }
}
class triangle extends Area{
    float Area(){
        return (4*4)/2;
    }
}

class AreaImpl{
    public static void main(String[] args) {

        Area A1=new triangle();
        Area A2=new Square();

        System.out.println(A1.Area());
        System.out.println(A2.Area());


    }
}
