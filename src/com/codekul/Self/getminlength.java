package com.codekul.Self;

import java.util.ArrayList;

public class getminlength {

    public static int get(ArrayList<Integer>arr){
        int i=arr.size()-1;
        while(!arr.isEmpty()){
            int m= arr.get(i);
            int n= arr.get(i-1);


            if(m%n>n%m){
                arr.remove(i);
                arr.remove(i-1);
                arr.add(m%n);
            }
            else{
                arr.remove(i);
                arr.remove(i-1);
                arr.add(n%m);
            }
            i--;
        }

        return arr.get(0);
    }

    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(2);
        arr.add(2);arr.add(2);arr.add(2);
        System.out.println ( get(arr));


    }
}
