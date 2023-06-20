package com.codekul.Dynamic_programming;

import java.util.HashMap;

public class Dynamic_Programming {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        System.out.println(  fibo(6,map));
    }
    public static int fibo(int n, HashMap<Integer,Integer>map){
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(!map.containsKey(n)){
            map.put(n,fibo(n-1,map)+fibo(n-2,map));
        }
        return map.get(n);
    }
}
