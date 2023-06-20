package com.codekul.Queue_Linkedlist;

import com.codekul.Queue.Queue;
import com.codekul.Stack.SinglyLinkedList;

import java.sql.SQLOutput;

public class Queue_Linkedlist {
    Node head=null;
    Node rear=null;
    int size=0;
    public void enqueue(int x)
    {
        Node node =new Node(x);
        if(head==null){
            head=node;
            rear=node;
        }
        rear.next=node;
        rear=rear.next;
        size++;

    }
    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int temp= head.value;
        head=head.next;
        size--;
        return temp;
    }

    public boolean isEmpty(){
        return (head==null);
    }

    public int getSize(){
        return size;
    }
    public int getrear(){
        return rear.value;
    }
    public int gethead(){
        return head.value;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }

}
