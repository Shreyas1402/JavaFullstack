package com.codekul.Encapsulation;

public class Employee {
   private  int id;
   private String name;
   private double salary; //write only
    private double bonus=500000;  //read only
    private String email;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;

    }
    public String getName(){
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return salary+bonus;


        }

    }


class EmployeeImpl{
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setId(1);
        employee.setName("SHREYAS");
        employee.setEmail("qweiop.com");
        employee.setSalary(1500000);
        System.out.println(employee.getId());
        System.out.println(employee.getName());
        System.out.println(employee.getEmail());
        System.out.println(employee.getBonus());

    }
}
