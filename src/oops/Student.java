package oops;

import java.util.Scanner;

public class Student {
    int rno;
    String address;
    String name;
    float age;

    void InsertData(int r, String nm, String ad, float ag) {
        rno = r;
        name = nm;
        address = ad;
        age = ag;


    }
    void display()
    {
        System.out.println("********** STUDENT DETAILS ************");
        System.out.println("NAME: "+name);
        System.out.println("roll no: "+rno);
        System.out.println("address: "+address);
        System.out.println("age: "+age);
    }

}


    class StudentInfo {
        public static void main(String[] args) {
            Student s1 = new Student();
            s1.rno = 1;
            s1.name = "Shreyas";
            s1.address = "WARJE";
            s1.age = 5.5f;
            System.out.println(s1.address);
            Scanner sc =new Scanner(System.in);
            System.out.println("ENTER ROLL NO");
            int rno = sc.nextInt();
            System.out.println("ENTER NAME");
            String nm= sc.next();
            System.out.println("ENTER ADDRESS");
            String ad= sc.next();
            System.out.println("ENTER AGE");
            float ag=sc.nextFloat();
            Student s2 = new Student();
            s2.InsertData(rno,nm,ad,ag);
            s2.display();
            Student s3= new Student();
            s3.InsertData(1,"Amit","kothrud",8.9f);
            s3.display();


        }
    }


