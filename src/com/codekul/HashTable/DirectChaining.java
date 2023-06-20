package com.codekul.HashTable;

import java.util.LinkedList;

public class DirectChaining {
    LinkedList<String> hash[];
    int maxloop=5;
    DirectChaining(int size){
        hash=new LinkedList[size];
    }
     public int modASCII(String word,int M){
     //  char ch[];
     //  ch=word.toCharArray();
        int sum=0;
        for(int i=0;i<word.length();i++){
            sum=sum+word.charAt(i);
        }
        return sum%M;
     }

     public void Insert(String word){
        int index=modASCII(word,hash.length);
        if(hash[index]==null){
            hash[index]=new LinkedList<>();
            hash[index].add(word);
        }
        else{
            hash[index].add(word);
        }
     }
     public void traversal(){
        for(int i=0;i<hash.length;i++){
            System.out.println("THE ELEMENT AT INDEX "+i+" IS "+hash[i]);
        }
     }
     public boolean search(String word) {
         int index = modASCII(word, hash.length);
         for (int i = 0; i < hash.length; i++) {
             if (hash[index]==hash[i]){
                 System.out.println(hash[index]+" found at index "+i);
                 return true;
             }
         }
         return false;
     }

     public void delete(String word){
         int index=modASCII(word,hash.length);
         boolean res=search(word);
         if(res==true){
         System.out.println( "SUCCESSSFULY REMOVED "+ hash[index].remove());
     }
         else{
             System.out.println("DNE");
         }
     }

}
