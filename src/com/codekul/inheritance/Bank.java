package com.codekul.inheritance;

import java.util.Scanner;

public class Bank {
    int BankNo;
    String ifsCode;

}
class sbi extends Bank{
    String address;
    String branchCode;
    double contactNO;

    void display()
    {
        System.out.println("BANK NO: "+BankNo);
        System.out.println("IFSCODE: "+ifsCode);
        System.out.println("BRANCHCODE: "+branchCode);
        System.out.println("ADDRESS: "+address);
        System.out.println("CONTACT NO: "+contactNO);
    }

    void display1(int a ,String ifs,String branch){
        System.out.println("BANK NO: "+a);
    }

}
class BankImpl{
    public static void main (String[] args){

        sbi sbiBank= new sbi();
        sbiBank.BankNo=1234567;
        sbiBank.ifsCode="1234qwegu345";
        sbiBank.branchCode="101010";
        sbiBank.address="WARJE";
        sbiBank.contactNO=987654321;
        sbiBank.display();
        sbi s1= new sbi();
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR BANK NUMBER: ");
        int a= sc.nextInt();
        System.out.println("ENTER YOUR IFSCODE: ");
        String ifs=sc.next();
        System.out.println("ENTER YOUR BRANCHCODE: ");
        String branch=sc.next();
        s1.display1( a,ifs,branch);



    }
}


