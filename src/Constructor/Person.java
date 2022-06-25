package Constructor;

public class Person {
    int id;
    String name;
    String address;

    Person(int i,String nm)
    {
        id =i;
        name=nm;
    }
    Person()
    {
        System.out.println("DEFAULT");
    }
    Person(String nm)
    {
        name =nm;
    }

    void display()
    {
        System.out.println("NAME: "+name);
        System.out.println("ID: "+id);
    }
}
class PersonImpl
{
    public static void main(String[] args)
    {
        Person p1=new Person(5,"zen");
        p1.display();
        Person p2=new Person();
        p2.display();
        Person p3=new Person("John");
       p3.display();
    }
}
