package com.codekul.Polymorphism;
// can we overload the main method.

public class Banks {
    float intrest() {
        return 7;
    }
}
    class SBI extends Banks{
        float intrest() {
            return 9;
        }
    }
    class ICICI extends Banks{
        float intrest() {
            return 11;
        }
    }
    class HDFC extends Banks{
        float intrest() {
            return 13;
        }
    }

    class BankIMPL{
        public static void main(String[] args){
            Banks rbi,rb1,rb2;
                  rbi  =new ICICI();
            System.out.println(rbi.intrest());

            rb1=new SBI();
            rb2=new HDFC();

            System.out.println(rb1.intrest());
            System.out.println(rb2.intrest());

        }
    }



