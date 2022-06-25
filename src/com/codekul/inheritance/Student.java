package com.codekul.inheritance;

public class Student {
    String name="Shreyas";
    int rno=123456;
    String div="A";

}
class PhysicsMarks extends Student{
    double physicsmarks = 78;

}
class ChemistryMarks extends Student{
    double chemistrymarks =89;
}
class MathsMarks extends Student{
    double Mathsmarks = 96;
}

class StudentImpl{
    public static void main(String[] args){
        MathsMarks m1=new MathsMarks();
        ChemistryMarks c1= new ChemistryMarks();
        PhysicsMarks p1=new PhysicsMarks();

        double total=m1.Mathsmarks+c1.chemistrymarks+p1.physicsmarks;
        double percentage=(total/3);
        System.out.println("*************STUDENT DETAILS*********");
        System.out.println(m1.name);
        System.out.println(m1.div);
        System.out.println(m1.rno);
        System.out.println("PERCENTAGE IS:"+percentage);




    }
}
