package com.codekul.Trees;

import java.lang.module.InvalidModuleDescriptorException;

public class Binary_T_Array {
    String[] arr;
    int lastUsedIndex;

    public Binary_T_Array(int size) {
        arr = new String[size + 1];
        System.out.println("TREE CREATED");
        this.lastUsedIndex = 0;
    }

    boolean isFull() {
        if(arr.length-1==lastUsedIndex){
            return true;
        }
        else{
            return false;
        }

    }
    public void Insert(String val){
        if(!isFull()){
            arr[lastUsedIndex+1]=val;
            lastUsedIndex++;
            System.out.println("Value inserted");
        }
        else{
            System.out.println("TREE IS FULL");
        }
    }
    public void PreOrder(int index){
        if(index>lastUsedIndex){
            return;

        }
        System.out.println(arr[index]);
        PreOrder(index*2);
        PreOrder(index*2+1);
    }
    public void Inorder(int index){
        if(index>lastUsedIndex){
            return;
        }
        Inorder(index*2);
        System.out.println(arr[index]);
        Inorder(index*2+1);

    }
    public void PostOrder(int index){
        if(index>lastUsedIndex) {
            return;
        }
            PostOrder(index*2);
            PostOrder(index*2+1);
        System.out.println(arr[index]+" ");
        }

        public void LevelOrder(){

        for(int i=1;i<=lastUsedIndex;i++){
            System.out.print(arr[i]+" -> " );
        }
        }
        public void Search(String val) {
            for (int i = 1; i <= lastUsedIndex; i++) {
                if (arr[i] == val) {
                    System.out.println("THE ELEMENT IS PRESENT AT" + i);

                }


            }
            System.out.println();
        }

        public void Delete(String val){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i]==val){
                arr[i]=arr[lastUsedIndex];
                lastUsedIndex--;
            }

        }

        }
    }

