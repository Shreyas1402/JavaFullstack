package com.codekul.HashTable;

import java.util.ArrayList;

public class Linear_probing {
    String [] hash;
    int usedCell;
    Linear_probing(int size){
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

    public void Rehashkey(String word){
        ArrayList<String> data=new ArrayList<>();
        for(String s:hash){
            if(s!=null){
                data.add(s);
            }
        }
        data.add(word);
        hash=new String[hash.length*2];
        //  Insert function has to be used.
    }
    public void Insert(String word){

        double load = LoadFactor();
        if(load>=0.75){
            Rehashkey(word);
        }
        else{
            int index=MODASCII(word,hash.length);
            for(int i=index;i<hash.length;i++) {
                int newIndex = i % hash.length;
                if (hash[newIndex] == null) {
                    hash[newIndex] = word;
                    System.out.println(word + " has been inserted to index" + newIndex);
                    break;
                } else {
                    System.out.println("finding a new location ");
                }
            }
        }
        usedCell++;
    }
    public boolean Search(String word){
        for(int i=0;i<hash.length;i++){
            if(hash[i]==word){
                System.out.println("found at "+i);
                return true;
            }

        }
        return false;
    }
    public void Delete(String word){
        int index =MODASCII(word,hash.length);
        for(int i=index;i<index+hash.length;i++){
            int newIndex=i%hash.length;

            if(hash[newIndex]!=null&&hash[newIndex].equals(word)){
                hash[newIndex]=null;
                System.out.println(word+" deleted");
                return;      // so that the loop breaks;
            }
            else{
                System.out.println("dne");
            }
        }
       }
    }

