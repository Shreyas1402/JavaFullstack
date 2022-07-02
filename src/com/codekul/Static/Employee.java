package com.codekul.Static;

public class Employee {
    int empNo;
    String empName;
    static String companyName;
    static void show(){
        //IN STATIC METHOD NON STATIC VARIABLE CANNOT BE CALLED.

        companyName="codekul";
        System.out.println(companyName);
    }
    void display(){
        companyName="werty";
        System.out.println(companyName);

    }
}
class EmployeeIMPL{
    public static void main(String[] args) {
        Employee.show();

        //for static variable we do not need to create a object.

        Employee e=new Employee();
        e.display();

    }

}
