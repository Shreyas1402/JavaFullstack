package com.codekul.OOPS;

public class fraction {
 private float numerator;
 private float denominator;
 float frac;
 public void setNumerator(float numerator){
     this.numerator=numerator;
 }
 public float getNumerator(){
     return numerator;
 }

    public void setDenominator(float denominator) {
        this.denominator = denominator;
    }

    public float getDenominator() {
        return denominator;
    }

    public fraction(){
     frac= numerator/denominator;
        System.out.println(frac);
 }


}
class main{
    public static void main(String[] args) {
        fraction f=new fraction();
        f.setNumerator(3.4f);
        f.setDenominator(4.5f);
        System.out.println(f.getDenominator());
        System.out.println(f.getNumerator());

    }
}