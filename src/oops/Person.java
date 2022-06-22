package oops;

import java.util.Scanner;
    public class Person {
        String name;
        float age;
        String address;
        float height;
        String gender;
        String occ;


        void display(String n,float ag,String add,float hei,String gen,String occ)
        {
            System.out.println("******** STUDENT DETAILS *********");
            System.out.println("NAME: "+n);
            System.out.println("AGE: "+ag);
            System.out.println("ADDRESS: "+add);
            System.out.println("HEIGHT: "+hei);
            System.out.println("GENDER: "+gen);
            System.out.println("OCCUPATION: "+occ);
        }



    }
    class InfoDisplay {
        public static void main(String[] args) {
            oops.Person p1 = new oops.Person();
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER NAME");
            String a = sc.next();
            System.out.println("ENTER AGE");
            float age = sc.nextFloat();
            System.out.println("ENTER ADDRESS");
            String address = sc.next();
            System.out.println("ENTER HEIGHT");
            float h = sc.nextFloat();
            System.out.println("ENTER GENDER");
            String g = sc.next();
            System.out.println("ENTER OCCUPATION");
            String occu = sc.next();
            p1.display(a,age,address,h,g,occu);
            Person p2= new Person();
            p2.display("qwert",198,"kothrud",123.456f,"male","asdfiop");

        }



        }

