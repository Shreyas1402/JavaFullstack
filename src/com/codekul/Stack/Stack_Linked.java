package com.codekul.Stack;

public class Stack_Linked {
    SinglyLinkedList list;

    public Stack_Linked() {
        list=new SinglyLinkedList();
    }
    public void push(int value){
        list.insertInLinkedList(value,0);
        System.out.println("Insert successful");
    }
    boolean isEmpty(){
        if(list.head==null){
            return true;
        }
        else
            return false;
    }
    public int pop(){
        int result=-1;
        if(isEmpty()){
            System.out.println("the stack is empty");

        }
        result=list.head.value;
        list.deletionOfNode(0);


        System.out.println("deletion succesful");
        return result;
    }
    public int peek(){

        if(isEmpty()){
            System.out.println("is empty");
        }

             return list.head.value;




    }
    public void tra(){
        list.traverseSinglyLinkedList();
    }
    public void delete(){
        list.head=null;
        System.out.println("Stack deleted");

    }
}

