package com.codekul.HashTable;

import java.util.ArrayList;

public class Qudratic_Probing {
    String hash[];
    int usedCell;
    Qudratic_Probing(int size){
        hash =new String[size];
        usedCell=0;
    }
    public int MODASCII(String word,int M){
        int sum=0;
        for(int i=0;i<word.length();i++){
            sum+=word.charAt(i);
        }
        return sum%M;
    }
    public  double LoadFactor(){
        double load=usedCell/hash.length;
        return load;
    }

    public void Rehashkey(String word) {
        ArrayList<String> data = new ArrayList<>();
        for (String s : hash) {
            if (s != null) {
                data.add(s);
            }
        }
        data.add(word);
        hash = new String[hash.length * 2];
        for (String s : data) {
            Insert(s);
            //  Insert function has to be used.
        }
    }
    public void Insert(String word){
        int counter=0;
        double load=LoadFactor();
        if(load>=0.75){
            Rehashkey(word);
        }
        int index=MODASCII(word,hash.length);
        for(int i=index;i<index+hash.length;i++){
            int newIndex=index+(counter*counter);//%hash.length;
            if(hash[newIndex]==null){
                hash[newIndex]=word;
                System.out.println(word+"word inserted at "+ newIndex);
                break;
            }
            else{
                System.out.println("already occupied finding new space");
            }
        }
    }
}
