package com.codekul.Stack;

import java.util.ArrayList;
import java.util.Stack;

class ListNode{
   ListNode next;
   int data;
   ListNode(int x){
       data=x;
       next=null;
   }

}

public class Mystack {
   static int size=-1;
    static ListNode head;
    static void push(int x){
        ListNode node=new ListNode(x);
        node.next=head;
        head=node;
        size++;
    }
   static int pop(){
        int temp=head.data;
        head=head.next;
        size--;
        return temp;

    }
   static int peek(){
        return head.data;
    }
   static  boolean isEmpty(){
        return (size==-1);
    }
    static int getSize(){
        return size+1;
    }
     static void traversal(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }


public static void main(String[] args) {
       push(1);
       push(12);
       push(13);

       traversal();
     int c= getSize();
    System.out.println(c);
       pop();
       pop();
    int b = getSize();
    System.out.println(b);

       traversal();
    Stack<Integer>s=new Stack<>();
    s.add(1);
    s.add(2);
    s.add(3);
    System.out.println(s);
    s.removeAll(s);
    System.out.println("removed"+s);
    }
}

