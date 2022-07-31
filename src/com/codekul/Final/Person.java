package com.codekul.Final;

public class Person {
    int empID;
    String name;
    final String PAN_NO="AMPFT12345";
    final String AADHAR_NO;
     final String MOBILE_NO;

    static final String BIRTH_Date;
      Person(){
          AADHAR_NO="123456789012";
          MOBILE_NO="1234567890";
          System.out.println(AADHAR_NO);
          System.out.println(MOBILE_NO);
      }
      static{
          BIRTH_Date="01/04/2002";
      }
      Person(String aadhar_no,String mobile_no){
          AADHAR_NO=aadhar_no;
          MOBILE_NO=mobile_no;
          System.out.println(AADHAR_NO);
          System.out.println(MOBILE_NO);
      }

}
class PersonIMPL{
    public static void main(String[] args) {
        Person  p1=new Person("`12345689","12345678");
    }
}