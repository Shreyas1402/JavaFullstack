package com.codekul.Self;

import java.util.Scanner;

public interface Bank {



}

class user implements Bank{
    String name;
    String AccountNumber;
    double WithdrawalAmt;
    double DepositAmt;



    public user(String name, String accountNumber, double withdrawalAmt, double depositAmt) {
        this.name = name;
        AccountNumber = accountNumber;
        WithdrawalAmt = withdrawalAmt;
        DepositAmt = depositAmt;
        System.out.println(name);
        System.out.println(accountNumber);
        System.out.println(withdrawalAmt);
        System.out.println(depositAmt);
    }
}

class bankIMpl{
    public static void main(String[] args) {
        System.out.println("FILL THE FORM");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME: ");
        String name=sc.nextLine();
        System.out.println("ENTER YOUR ACCOUNT NUMBER:");
        String accountNumber=sc.next();
        double Withdrawal;
        double Deposit;
        System.out.println(" PLEASE ENTER  1 FOR WITHDRAWAL OR 2  for DEPOSIT");
        char a=sc.next().charAt(0);
        if(a=='W'){
            Deposit=0;
            System.out.println("ENTER YOUR WITHDRAWAL AMOUNT:");
             Withdrawal =sc.nextDouble();
        }
        else{
            Withdrawal=0;
            System.out.println("ENTER YOUR DEPOSIT AMOUNT:");
            Deposit=sc.nextDouble();


        }
        user p1=new user(name,accountNumber,Withdrawal,Deposit);



    }
}