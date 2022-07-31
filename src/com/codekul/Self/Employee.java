package com.codekul.Self;

public class Employee {
    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
class impl
{
    public static void main(String[] args) {
        Employee E=new Employee("shreyas ","pappu",101);
        Employee a=new Employee("shreyas ","pappu",101);
        Employee v=new Employee("shreyas ","pappu",101);

    }
}
