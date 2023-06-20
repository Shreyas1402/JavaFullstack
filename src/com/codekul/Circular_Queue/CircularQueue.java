package com.codekul.Circular_Queue;

public class CircularQueue {
    int arr[];
    int top;
    int beginning;
    int size;

    public CircularQueue(int size) {
        this.size = size;
        this.arr=new int[size];
        this.top=-1;
        beginning=-1;

        System.out.println("QUEUE CREATED WITH A SIZE OF "+size);


    }
    public boolean isEmpty(){
        if(top==-1){
            System.out.println("the queue is empty");
            return true;

        }
        else
            return false;

    }
    public boolean isFull(){
        if(top==arr.length-1){
            System.out.println("the queue is full");
            return true;
        }
        else
            return false;
    }
    public void Enqueue(int val){
        if(isFull()){
            System.out.println("THE QUEUE IS FULL");
        } else if (isEmpty()) {
            beginning=0;
            top=0;
            arr[top]=val;

            System.out.println("THE VALUE:"+val+"HAS BEEN ADDED TO THE INDEX"+top);
            top++;

        }else
        {
            if(top+1==size){
                top=0;

            }else {
                top++;
            }
            arr[top]=val;
            System.out.println("THE VALUE:"+val+"HAS BEEN ADDED TO THE INDEX"+top);


        }


    }
    public int Dequeue(){
        int del=0;
        if(isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        } else {
            int result=arr[beginning];
            arr[beginning]=0;

            if(beginning==top){
                beginning=top=-1;
                return top;
            }else if(beginning+1==size) {
                beginning=0;
            }
            else{
                beginning++;
            }
            return result;

            }

        }
        public int peek(){
        int result=0;
            if(isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
        }
            result=arr[beginning];
            return result;

        }

    }



