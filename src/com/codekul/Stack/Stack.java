package com.codekul.Stack;

public class Stack {
    int [] arr;
    int topOfStack;

    public Stack(int size){
        this.arr=new int[size];
        this.topOfStack=-1;// as the array initilizes at 0
        System.out.println("size is "+size);
    }
    public boolean isEmpty(){
        if(topOfStack==-1){
            return true;
        } else  {
            return false;
        }
    }
    public boolean isFull(){
        if(topOfStack== arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void Push(int value){
        if(isFull()){
            System.out.println("STACK IS FULL");

        }
        else{
           arr[topOfStack+1]=value;
            topOfStack++;
            System.out.println("Value is successfully inserted");
        }

    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("the stack is empty");
            return -1;
        } else {
            int element = arr[topOfStack];
            topOfStack--;
           return element;
        }
    }
    // My peek logic
    public int peek(){
        topOfStack= arr.length-1;

        if(isFull()) {

            int a = arr[topOfStack];

            return a;
        }
        else {
            isEmpty();
        }
        return -1;
    }
    // Peek method another approach

    public int peek1(){
        topOfStack= arr.length;


        int a=0;
        if(isEmpty()){
            System.out.println("is empty");
        }
        else{
            a=arr[topOfStack-1];

        }
        return a;


    }

    public int length() {
        int v = arr.length;
        return v;
    }
        public void delete(){
            arr=null;
            System.out.println("STACK DELETED ");
        }
    }



