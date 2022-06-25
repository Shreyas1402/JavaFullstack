package Constructor;

public class Employee {
    int id;
    String name;
    String companyname;




    Employee(){
        System.out.println("THIS IS A DEFAULT CONSTRUCTOR");

    }


    void display() {
        System.out.println("ID: " +id);
        System.out.println("NAME: "+ name);
        System.out.println("COMPANY NAME: "+companyname);
    }
}

class Employeeimpl
{
    public static void main(String[] args)
    {
        Employee e1=new Employee();
        Employee e2=new Employee();
        e1.display();
        e2.display();
    }
}