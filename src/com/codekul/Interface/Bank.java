package com.codekul.Interface;

public interface Bank {
    double getRateofIntrest();
     float N=10;

}
interface BankOperations extends Bank{
    double calculateIntrest();
}
class HDFC implements BankOperations{
    @Override
    public double getRateofIntrest() {
        return 10;

    }

    @Override
    public double calculateIntrest() {
        return 0;
    }
}
class BankIMPL{
    public static void main(String[] args) {

    }
    }

