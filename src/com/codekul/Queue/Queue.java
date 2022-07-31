package com.codekul.Queue;

public class Queue {
    int[] arr;
    int top;
    int beginning;

    public Queue(int size) {
        this.arr = new int[size];
        this.top = -1;
        this.beginning = -1;
        System.out.println("Queue is created with Size " + size);

    }

    public boolean isFull() {
        if (top == arr.length - 1) {
            System.out.println("Queue is Full");
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (beginning == -1 || beginning == arr.length) {
            System.out.println("Queue is Empty");
            return true;
        }
        return false;
    }

    public void Enqueue(int value) {

        if (isFull()) {
            System.out.println("Is FULL");
        } else if (isEmpty()) {
            beginning = 0;// queue starts from this value;
            top++;
            arr[top] = value; // adding values
            System.out.println("inserted " + value);

        } else {
            top++;
            arr[top] = value;
            System.out.println("inserted value " + value);
        }
    }

    public int Dequeue() {
        int a = 0;

        if (isEmpty()) {
            System.out.println("It is empty");
            return -1;
        } else {
            a = arr[beginning];
            beginning++;
            if(beginning>top){
                beginning=top=-1;
            }


        }
        return a;
    }

    public int peek() {
        int c=0;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            beginning = 0;
            c = arr[beginning];
        }
         return c;


    }
    public void delete(){
        arr=null;
        System.out.println("we have deleted the queue");
    }
    public void enqueue(int val){
        if(isFull()){
            System.out.println("the queue is full");
        } else if (isEmpty()) {
            beginning = 0;
            top = 0;
            arr[top] = val;

            System.out.println("ELEMEMT ENTERED"+val+"AT POSITION"+top);
            top++;
        }
        else
            arr[top]=val;
        top++;
        System.out.println("elememt instered at"+top);

        }
    }
