package com.codekul.Strings;

import java.security.Security;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;


public class RandomString {
   static Hashtable<String,String> H= new Hashtable<>();
    Scanner sc =new Scanner(System.in);
    public void Input(){
        System.out.println("Please enter your email ID: ");
        String email=sc.nextLine();
        H.put(email,RandomS());
        String p=H.get(email);
        System.out.println(p);
        if(H.containsKey(p)){
            Input();
        }
       else{
           result(email,p);
        }
    }

    public void result(String E,String P){
        System.out.println("the password for email: "+ E +" is: "+ P);



    }



    public String RandomS(){

        String S="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#$%^&*/";
        String R="";



        Random rand =new Random();
        int n =6;
        char text[]=new char[n];

        for(int i=0;i<n;i++){
            text[i]=S.charAt(rand.nextInt(S.length()));
        }
        for (int i=0;i<text.length;i++){
            R+=text[i];
        }
      return R;
    }



    public static void main(String[] args) {
        RandomString r = new RandomString();
        r.Input();
        System.out.println(H);
    }

        }
