package com.codekul.Recursion;

public class Digits {
    static String PrintDigitname(int n,String S,String arr[]){

        if(n==0){
            return S;
        }
        int x=n%10;
        S=arr[x]+S;

       return PrintDigitname(n/10,S,arr);
    }

    public static void main(String[] args) {
        int n=413909090;
        String arr[]={"ZERO ","ONE ","TWO ","THREE ","FOUR ","FIVE ","SIX ","SEVEN ","EIGHT ","NINE "};
      String c=PrintDigitname(n,"",arr);

        System.out.println(c);

    }
}
