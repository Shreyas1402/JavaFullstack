package com.codekul.Arrays;

import java.util.Scanner;
// addition of sum of an array
//

public class Person {
    private int age;
    private String name;


    private int height;
    private String mobile_no;
    private String address;

    public Person(int age, String name, int height, String mobile_no, String address) {
        this.age = age;
        this.name = name;
        this.height = height;
        this.mobile_no = mobile_no;
        this.address = address;
    }
}

class personImpl{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Person person[]= new Person[size];



    }
}

