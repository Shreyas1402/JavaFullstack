package com.codekul.Self;

public class recursion {
    public void rec(int n){
        if(n<1){
            return;
        }
        System.out.println(n);
        rec(n-1);
        rec(n-2);

    }
}
class Mainn{
    public static void main(String[] args) {
        recursion r=new recursion();
        r.rec(6);
    }

}
